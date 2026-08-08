# 🐚 Shell Scripting Notes

## Introduction

Shell scripting is the process of writing a series of Linux commands in a file so they can be executed automatically. It helps automate repetitive tasks, reduce manual effort, and improve productivity.

---

# 📌 Basic Shell Commands

## `echo`

Displays text or variable values on the terminal.

**Syntax**

```bash
echo "message"
```

**Example**

```bash
echo "Hello, World!"
```

**Output**

```
Hello, World!
```

---
# 🐚 Shell Scripting Bootcamp

<div align="center">

![Linux](https://img.shields.io/badge/Linux-Ubuntu-E95420?style=for-the-badge\&logo=ubuntu\&logoColor=white)
![Shell](https://img.shields.io/badge/Shell-Bash-4EAA25?style=for-the-badge\&logo=gnubash\&logoColor=white)
![Level](https://img.shields.io/badge/Level-Beginner-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

### 📖 Beginner Guide to Basic Commands, Loops & Case Statements

</div>

---

# 📚 Table of Contents

* [Introduction](#-introduction)
* [Basic Shell Commands](#-basic-shell-commands)

  * [echo](#1-echo)
  * [read](#2-read)
  * [Variables](#3-variables)
  * [Comments](#4-comments)
  * [Arithmetic Operations](#5-arithmetic-operations)
  * [Exit Status](#6-exit-status)
* [Loops](#-loops)

  * [for Loop](#1-for-loop)
  * [while Loop](#2-while-loop)
  * [until Loop](#3-until-loop)
* [Case Statement](#-case-statement)

  * [Syntax](#syntax)
  * [Examples](#examples)
* [Best Practices](#-best-practices)
* [Summary](#-summary)

---

# 📖 Introduction

Shell scripting is the process of writing Linux commands inside a file so they can be executed automatically.

### ✅ Advantages

* Automates repetitive tasks
* Saves time
* Reduces manual work
* Improves productivity
* Easy to maintain

---

# 💻 Basic Shell Commands

## 1. `echo`

Displays text or variables on the terminal.

### Syntax

```bash
echo "message"
```

### Example

```bash
echo "Hello World"
```

### Output

```text
Hello World
```

> 💡 **Tip:** `echo` is mainly used to display messages and variable values.

---

## 2. `read`

Accepts input from the user.

### Syntax

```bash
read variable_name
```

### Example

```bash
echo "Enter your name:"
read name

echo "Welcome, $name"
```

---

## 3. Variables

Variables store values that can be reused later.

### Syntax

```bash
variable=value
```

### Example

```bash
name="Reshin"

echo $name
```

---

## 4. Comments

Comments help explain the code.

### Single-line Comment

```bash
# This is a comment
```

---

## 5. Arithmetic Operations

Perform mathematical calculations.

### Example

```bash
a=15
b=10

sum=$((a+b))

echo $sum
```

### Output

```text
25
```

---

## 6. Exit Status

Every Linux command returns an exit status.

| Exit Code | Meaning |
| --------- | ------- |
| `0`       | Success |
| Non-zero  | Error   |

Check the exit status:

```bash
echo $?
```

> 💡 **Tip:** Always check the exit status when debugging scripts.

---

# 🔁 Loops

Loops execute a block of code repeatedly.

---

## 1. `for` Loop

Used when the number of iterations is known.

### Syntax

```bash
for variable in values
do
    commands
done
```

### Example

```bash
for i in 1 2 3 4 5
do
    echo $i
done
```

### Output

```text
1
2
3
4
5
```

---

## 2. `while` Loop

Executes while the condition remains true.

### Syntax

```bash
while [ condition ]
do
    commands
done
```

### Example

```bash
count=1

while [ $count -le 5 ]
do
    echo $count
    count=$((count+1))
done
```

### Output

```text
1
2
3
4
5
```

---

## 3. `until` Loop

Runs until the condition becomes true.

### Syntax

```bash
until [ condition ]
do
    commands
done
```

### Example

```bash
count=1

until [ $count -gt 5 ]
do
    echo $count
    count=$((count+1))
done
```

### Output

```text
1
2
3
4
5
```

---

# 🔀 Case Statement

The `case` statement compares one value against multiple choices. It is easier to read than using many `if-elif` conditions.

---

## Syntax

```bash
case variable in
    pattern1)
        commands
        ;;
    pattern2)
        commands
        ;;
    *)
        default command
        ;;
esac
```

---

# Examples

## Example 1 – Day Checker

```bash
echo "Enter Day Number (1-7)"
read day

case $day in
1)
    echo "Monday"
    ;;
2)
    echo "Tuesday"
    ;;
3)
    echo "Wednesday"
    ;;
4)
    echo "Thursday"
    ;;
5)
    echo "Friday"
    ;;
6)
    echo "Saturday"
    ;;
7)
    echo "Sunday"
    ;;
*)
    echo "Invalid Input"
    ;;
esac
```

---

## Example 2 – Calculator

```bash
echo "Enter First Number"
read a

echo "Enter Second Number"
read b

echo "Choose Operation (+ - * /)"
read op

case $op in
+)
    echo "Result = $((a+b))"
    ;;
-)
    echo "Result = $((a-b))"
    ;;
\*)
    echo "Result = $((a*b))"
    ;;
/)
    echo "Result = $((a/b))"
    ;;
*)
    echo "Invalid Operation"
    ;;
esac
```

---

# 💡 Best Practices

* ✅ Use meaningful variable names.
* ✅ Add comments wherever necessary.
* ✅ Keep proper indentation.
* ✅ Test scripts with multiple inputs.
* ✅ Handle invalid input gracefully.
* ✅ Keep scripts simple and readable.

---

# 📝 Summary

| Topic            | Description                                |
| ---------------- | ------------------------------------------ |
| `echo`           | Prints text or variable values             |
| `read`           | Reads user input                           |
| Variables        | Store values                               |
| Comments         | Improve readability                        |
| Arithmetic       | Perform calculations                       |
| Exit Status      | Indicates command success or failure       |
| `for` Loop       | Repeats for a fixed number of values       |
| `while` Loop     | Runs while a condition is true             |
| `until` Loop     | Runs until a condition becomes true        |
| `case` Statement | Selects actions based on matching patterns |

---

<div align="center">

### 🎯 Keep Practicing • Keep Learning • Keep Automating

⭐ If you found these notes helpful, consider starring the repository!

</div>

## `read`

Accepts input from the user.

**Syntax**

```bash
read variable_name
```

**Example**

```bash
echo "Enter your name:"
read name

echo "Welcome, $name"
```

---

## Variables

Variables store data that can be used later in the script.

**Syntax**

```bash
variable=value
```

**Example**

```bash
name="Reshin"

echo $name
```

---

## Comments

Comments are ignored during execution and are used to explain the code.

**Single-line Comment**

```bash
# This is a comment
```

---

## Arithmetic Operations

Perform mathematical calculations.

**Example**

```bash
a=20
b=10

sum=$((a+b))
echo $sum
```

---

## Exit Status

Every command returns an exit status.

* `0` → Success
* Non-zero → Error

Check the status using:

```bash
echo $?
```

---

# 🔁 Loops

Loops execute a block of code repeatedly.

---

## 1. `for` Loop

Used when the number of iterations is known.

**Syntax**

```bash
for variable in values
do
    commands
done
```

**Example**

```bash
for i in 1 2 3 4 5
do
    echo $i
done
```

**Output**

```
1
2
3
4
5
```

---

## 2. `while` Loop

Executes as long as the condition is true.

**Syntax**

```bash
while [ condition ]
do
    commands
done
```

**Example**

```bash
count=1

while [ $count -le 5 ]
do
    echo $count
    count=$((count+1))
done
```

---

## 3. `until` Loop

Executes until the condition becomes true.

**Syntax**

```bash
until [ condition ]
do
    commands
done
```

**Example**

```bash
count=1

until [ $count -gt 5 ]
do
    echo $count
    count=$((count+1))
done
```

---

# 🔀 Case Statement

A `case` statement is used to compare one value against multiple options. It is a cleaner alternative to multiple `if-elif` statements.

---

## Syntax

```bash
case variable in
    pattern1)
        commands
        ;;
    pattern2)
        commands
        ;;
    *)
        default commands
        ;;
esac
```

---

## Example 1 – Day Checker

```bash
echo "Enter a day number (1-7):"
read day

case $day in
1)
    echo "Monday"
    ;;
2)
    echo "Tuesday"
    ;;
3)
    echo "Wednesday"
    ;;
4)
    echo "Thursday"
    ;;
5)
    echo "Friday"
    ;;
6)
    echo "Saturday"
    ;;
7)
    echo "Sunday"
    ;;
*)
    echo "Invalid Input"
    ;;
esac
```

---

## Example 2 – Simple Calculator

```bash
echo "Enter first number:"
read a

echo "Enter second number:"
read b

echo "Choose operation (+ - * /)"
read op

case $op in
+)
    echo "Result = $((a+b))"
    ;;
-)
    echo "Result = $((a-b))"
    ;;
\*)
    echo "Result = $((a*b))"
    ;;
/)
    echo "Result = $((a/b))"
    ;;
*)
    echo "Invalid Operation"
    ;;
esac
```

---

# 📖 Best Practices

* Use meaningful variable names.
* Add comments to explain complex logic.
* Indent your code properly for readability.
* Test scripts with different inputs.
* Handle invalid input whenever possible.

---

# 📚 Summary

This document covered:

* Basic shell scripting commands (`echo`, `read`, variables, comments, arithmetic, exit status)
* Looping statements (`for`, `while`, `until`)
* `case` statement with syntax and examples

These concepts form the foundation of Bash shell scripting and are commonly used to automate Linux tasks.

