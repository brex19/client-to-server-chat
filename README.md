

# Client-Server Chat Application (Java)

## Overview

This project is a simple client-server chat application written in Java. It allows a single client to connect to a server and exchange messages. The project demonstrates the use of socket programming for network communication and basic input/output streams for sending and receiving messages.

## Features

- **Single Client-Server Communication**: Only one client can connect to the server at a time.
- **Real-time Messaging**: Messages sent from the client are received by the server and vice versa.
- **Connection Handling**: The server listens for a client connection and handles the message exchange once the client connects.

## Requirements

- Java JDK 8 or higher
- A working network connection (for testing on different machines, ensure the client and server are on the same network)

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/client-server-chat-java.git
cd client-server-chat-java
```

### 2. Compile the Project

To compile the Java files, open a terminal or command prompt in the project directory and run the following commands:

```bash
javac -d bin src/server/ChatServer.java
javac -d bin src/client/ChatClient.java
```

### 3. Start the Server

To start the server, run the following command from the project directory:

```bash
java -cp bin server.ChatServer <port_number>
```

Replace `<port_number>` with the port you want the server to listen on (e.g., 12345).

Example:

```bash
java -cp bin server.ChatServer 12345
```

### 4. Start the Client

Once the server is running, you can start the client. Open another terminal or command prompt and run:

```bash
java -cp bin client.ChatClient <server_ip> <port_number>
```

- `<server_ip>` is the IP address of the machine running the server. If running on the same machine, you can use `localhost`.
- `<port_number>` should match the port on which the server is running.

Example:

```bash
java -cp bin client.ChatClient localhost 12345
```

### 5. Chat Away!

- After starting the client, you can send messages by typing into the terminal.
- The server and client will exchange messages in real-time.

## Usage

- **Server**: Receives and responds to messages from the client.
- **Client**: Sends messages to the server and displays responses.

### Server Output Example

```plaintext
Server started on port 12345...
Client connected: 192.168.1.2
Client says: Hello, Server!
```

### Client Output Example

```plaintext
Connected to the chat server
You: Hello, Server!
Server: Hello, Client!
```

## Code Highlights

- **Socket Programming**: Uses `Socket` and `ServerSocket` classes to facilitate client-server communication.
- **Input/Output Streams**: Handles message exchange using `BufferedReader` and `PrintWriter`.

## Improvements

- **Multiple Client Support**: Extend the project to handle multiple clients using threads.
- **Graphical User Interface**: Implement a GUI for both client and server using Java Swing or JavaFX.
- **Message Encryption**: Enhance security by implementing encryption for message exchange.


