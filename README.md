# Real-Time Chat Application

This is a real-time chat application built using **Spring Boot**, **Thymeleaf**, **WebSocket**, and **STOMP**. It supports multiple users in a single chat room, allowing everyone to see all messages sent by any user. It is designed to function as a group discussion platform.

## Features

- Real-time messaging using WebSocket and STOMP protocols.
- Single chat window shared by all users.
- User-friendly interface built with **HTML**, **Bootstrap CSS**, and **Thymeleaf**.
- Easy to set up and extend.

## Tech Stack

- **Backend:** Spring Boot, WebSocket, STOMP
- **Frontend:** Thymeleaf, HTML, Bootstrap CSS, STOMP.js, Sock.js

## Prerequisites

Before you begin, ensure you have the following installed:

- Java 17 or later
- Maven 3.6+
- A modern web browser (e.g., Chrome, Firefox, Edge)

## Getting Started

### Clone the Repository
```bash
git clone <repository-url>
cd <repository-folder>
```

### Build and Run the Application

1. Open a terminal and navigate to the project directory.
2. Build the application using Maven:
   ```bash
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

The application will start and be accessible at `http://localhost:8080`.

### Access the Application

1. Open your web browser and navigate to `http://localhost:8080/chat`.
2. Enter your name in the "Your name" input field.
3. Type your message in the "Type a message" input field and click "Send".
4. Your message will appear in the chat window and be visible to all users connected to the chat room.

## Project Structure

### Backend

The backend uses Spring Boot to handle WebSocket connections and process messages. Messages are broadcast to all connected users via a message broker.

### Frontend

The frontend is built using Thymeleaf and Bootstrap for a responsive user interface. STOMP.js and Sock.js are used to manage WebSocket connections and real-time messaging.

## Dependencies

### Backend Dependencies

- Spring Boot Starter Web
- Spring Boot Starter WebSocket
- Thymeleaf
- Spring Boot DevTools

### Frontend Libraries

- **Bootstrap CSS** for styling: `https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css`
- **Sock.js** for WebSocket fallback: `https://cdn.jsdelivr.net/npm/sockjs-client@1/dist/sockjs.min.js`
- **STOMP.js** for WebSocket communication: `https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.1/stomp.min.js`

## Future Enhancements

- Add user authentication and role-based permissions.
- Display user typing indicators.
- Allow users to create private chat rooms.
- Persist messages using a database for chat history.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

**Happy Chatting!**
