// Import and export
import React, { useState } from 'react';
export const PI = 3.14;

// Class with constructor and method
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  
  greet() {
    console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
  }
}

// Async function and arrow function
async function fetchData(url) {
  try {
    const response = await fetch(url);
    if (!response.ok) throw new Error('Network response was not ok');
    const data = await response.json();
    return data;
  } catch (error) {
    console.error('Fetch error:', error);
  }
}

const multiply = (a, b) => a * b;

// Variable declarations and control structures
let count = 0;
const limit = 5;

for (let i = 0; i < limit; i++) {
  if (i % 2 === 0) {
    console.log(`Even number: ${i}`);
  } else {
    console.warn(`Odd number: ${i}`);
  }
  count++;
}

// Try-catch-finally and throw
try {
  throw new Error('Something went wrong!');
} catch (e) {
  console.error(e.message);
} finally {
  console.info('Execution completed.');
}

// Decorator example (commonly in frameworks like Angular/TypeScript)
@sealed
class DemoClass {
  method() {
    console.log('Method called');
  }
}

function sealed(constructor) {
  Object.seal(constructor);
  Object.seal(constructor.prototype);
}

// Template literal with backticks
const message = `This is a
multiline string with a value: ${count}`;
console.log(message);
