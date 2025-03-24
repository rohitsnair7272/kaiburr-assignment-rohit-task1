# **Kaiburr Task Manager - CRUD REST API with Spring Boot & MongoDB**

**Author:** Rohit S Nair

## **Table of Contents**

1. [Project Overview](#project-overview)
2. [Tech Stack](#tech-stack)
3. [Setup & Installation](#setup--installation)
   - [1. Prerequisites](#1-prerequisites)
   - [2. Clone the Repository](#2-clone-the-repository)
   - [3. Install Dependencies](#3-install-dependencies)
   - [4. MongoDB Setup using Compass](#4-mongodb-setup-using-compass)
   - [5. Install & Setup Postman](#5-install--setup-postman)
   - [6. Run the Spring Boot Application](#6-run-the-spring-boot-application)
4. [API Endpoints & Postman Testing](#api-endpoints--postman-testing)
5. [Screenshots](#screenshots)
6. [Common Issues & Debugging](#common-issues--debugging)
7. [Final Notes](#final-notes)

---

## **Project Overview**

This is a **Task Manager REST API** built with **Spring Boot** and **MongoDB** to perform CRUD operations. It supports:  
✅ Creating, retrieving, updating, and deleting tasks  
✅ Searching tasks by name  
✅ Executing tasks  
✅ Storing execution history

---

## **Tech Stack**

- **Backend:** Spring Boot (Java)
- **Database:** MongoDB (using MongoDB Compass)
- **Build Tool:** Maven
- **API Testing Tool:** Postman

---

## **Setup & Installation**

### **1. Prerequisites**

Ensure you have the following installed:  
✅ **Java 17**  
✅ **Maven**  
✅ **MongoDB & MongoDB Compass**  
✅ **Postman**

#### **Checking Java & Maven Installation**

To verify Java installation, run:

```sh
java -version
```

Expected Output:

```
java version "17.0.x"
```

To verify Maven installation, run:

```sh
mvn -version
```

Expected Output:

```
Apache Maven 3.x.x
```

#### **Installing MongoDB & MongoDB Compass**

Download and install:

- **MongoDB Community Edition**: [Download](https://www.mongodb.com/try/download/community)
- **MongoDB Compass**: [Download](https://www.mongodb.com/try/download/compass)

---

### **2. Clone the Repository**

```sh
git clone https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1
cd kaiburr-assignment-rohit-task1
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/cloneRepo.png?raw=true)

---

### **3. Install Dependencies**

Navigate to the project directory and install dependencies using Maven:

```sh
mvn clean install
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/mvnInstall.png?raw=true)

---

### **4. MongoDB Setup using Compass**

#### **Step 1: Open MongoDB Compass**

1. Launch **MongoDB Compass**
2. Click **"Connect"** and use the **default localhost connection (`mongodb://localhost:27017`)**

#### **Step 2: Create Database & Collection**

1. Click **"Create Database"**
2. Enter **Database Name:** `task_manager`
3. Enter **Collection Name:** `tasks`
4. Click **"Create Database"**

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/MongoCreate.png?raw=true)

#### **Step 3: Verify Database Creation**

1. Click on `task_manager` → `tasks`
2. The collection should be empty

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/EmptyDatabase.png?raw=true)

---

### **5. Install & Setup Postman**

#### **Step 1: Download & Install Postman**

- Download Postman: [Postman Official Download](https://www.postman.com/downloads/)
- Install Postman by following on-screen instructions

#### **Step 2: Launch Postman**

- Open Postman
- Click on **"Create a new request"**
- Select **HTTP Method** (GET, POST, PUT, DELETE)
- Enter the API URL (`http://localhost:8080/tasks`)

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanRequest.png?raw=true)

---

### **6. Run the Spring Boot Application**

1. Open a terminal in the project root folder
2. Run the application using Maven:
   ```sh
   mvn spring-boot:run
   ```
3. The API will start at `http://localhost:8080`

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/mvnRUN.png?raw=true)

---

## **API Endpoints & Postman Testing**

### **1. Create a Task**

**Endpoint:**

```
POST /tasks
```

**Request Body (JSON):**

```json
{
  "id": "task1",
  "name": "Check Server Health",
  "owner": "Admin",
  "command": "ping -c 4 google.com"
}
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanPOST.png?raw=true)

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanPOST2.png?raw=true)

---

### **2. Get All Tasks**

**Endpoint:**

```
GET /tasks
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanGET.png?raw=true)

---

### **3. Get Task by ID**

**Endpoint:**

```
GET /tasks/task1
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanGETID.png?raw=true)

---

### **4. Update a Task**

**Endpoint:**

```
PUT /tasks/task1
```

**Request Body:**

```json
{
  "name": "Updated Task Name",
  "owner": "New Owner",
  "command": "echo This is the updated command"
}
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanPUT.png?raw=true)

---

### **5. Delete a Task**

**Endpoint:**

```
DELETE /tasks/task1
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanDELETE.png?raw=true)

---

### **6. Search Task by Name**

**Endpoint:**

```
GET /tasks/search?name=Server
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanSearchName.png?raw=true)

---

### **7. Execute a Task**

**Endpoint:**

```
PUT /tasks/task2/execute
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanExecute.png?raw=true)

---

### **8. Fetch Execution History**

**Endpoint:**

```
GET /tasks/history
```

📸 **Screenshot:** ![image alt](https://github.com/rohitsnair7272/kaiburr-assignment-rohit-task1/blob/master/screenshots/PostmanHistory.png?raw=true)

---
