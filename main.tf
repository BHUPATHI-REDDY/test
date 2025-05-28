provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "my_ec2" {
  ami                         = "ami-0953476d60561c955"
  instance_type               = "t2.micro"
  subnet_id                   = "subnet-0d86db4f1622ae762"    # <-- Existing subnet
  vpc_security_group_ids      = [aws_security_group.web.id]   # Security group inside the same VPC
  key_name                    = "nginxkeypair"           # Ensure this key pair exists

  tags = {
    Name = "MyInstance"
  }
}

resource "aws_security_group" "web" {
  name        = "web-sg"
  description = "Allow HTTP and SSH"
  vpc_id      = "vpc-01cc32ad79cdd3d21"    # <-- Existing VPC ID

  ingress {
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }
}
