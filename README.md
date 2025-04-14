<h1>🧠 String Analyzer </h1>

A full-stack web application built with **ReactJS** and **Spring Boot** that allows users to analyze strings in multiple ways — from checking palindromes to counting characters, converting cases, compressing strings, and more!

---

## 🚀 Features

- ✅ Reverse a string
- ✅ Check if a string is a Palindrome
- ✅ Count characters and words
- ✅ Convert to camelCase, UPPERCASE, lowercase
- ✅ Compress strings (like `aaabb → a3b2`)
- ✅ Analyze frequency of each character
- ✅ More string operations coming soon...

---

## 🛠️ Tech Stack

| Frontend              | Backend                  |
|-----------------------|--------------------------|
| ⚛️ React + Vite       | ☕ Spring Boot + Java 17 |
| 🌀 Tailwind CSS        | 🌐 REST APIs             |
| 🔄 Axios (API calls)   | 🧪 JUnit (for testing)   |

---

## 📂 Folder Structure

```
string-analyzer/
├── string-analyzer-frontend/      # React + Tailwind frontend
└── string-analyzer/               # Spring Boot backend
```

---

## 🔧 Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/TheeViR/string-analyzer.git
cd string-analyzer
```

---

### 2. Run Frontend (React)

```bash
cd string-analyzer-frontend
npm install
npm run dev
```

---

### 3. Run Backend (Spring Boot)

Using Maven (if installed):
```bash
cd string-analyzer-backend
mvn spring-boot:run
```

If using Maven Wrapper:
```bash
./mvnw spring-boot:run
```

---

## 🌐 API Endpoints

| Method | Endpoint               | Description                  |
|--------|------------------------|------------------------------|
| POST   | `/api/analyze/reverse` | Reverse a string             |
| POST   | `/api/analyze/palindrome` | Check for palindrome       |
| POST   | `/api/analyze/wordcount`  | Word and character count   |
| ...    | More endpoints coming 🔜 |

---

## 💡 Future Enhancements

- 🔒 User Authentication & History
- 📊 Visual Reports of Analysis
- 📥 File upload for bulk string analysis
- 🌐 Multilingual support

---

## 🙋‍♂️ Author

Made with ❤️ by [Vir (TheeViR)](https://github.com/TheeViR)  
Feel free to ⭐ star this repo and contribute!

---

## 📃 License

This project is licensed under the MIT License.
```
