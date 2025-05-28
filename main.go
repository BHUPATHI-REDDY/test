package main

import (
	"fmt"
	"log"
	"errors"
)

type Person struct {
	Name string
	Age  int
}

type Greeter interface {
	Greet() string
}

func (p Person) Greet() string {
	return fmt.Sprintf("Hello, my name is %s and I am %d years old.", p.Name, p.Age)
}

func checkError(err error) {
	if err != nil {
		log.Println("An error occurred:", err)
	}
}

func main() {
	// Create a person
	person := Person{Name: "Alice", Age: 30}

	// Print greeting
	fmt.Println(person.Greet())

	// Anonymous function with defer and go routine
	defer fmt.Println("Exiting program.")
	go func() {
		fmt.Println("This is a goroutine.")
	}()

	// Example switch
	switch person.Age {
	case 30:
		fmt.Println("You're 30!")
	default:
		fmt.Println("Age is not 30.")
	}

	// Error handling
	err := errors.New("sample error")
	if err != nil {
		checkError(err)
	}

	// Raw string literal
	query := `SELECT * FROM users WHERE name = "Alice";`
	fmt.Println(query)
}
