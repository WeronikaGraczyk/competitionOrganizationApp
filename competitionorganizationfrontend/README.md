Online Store - Backend in Java and Spring Boot, Frontend in React
Project Description
The online store project is a complete web application that combines a backend written in Java using Spring Boot with a frontend written in React. The store allows users to browse products, add them to the shopping cart, proceed with the checkout process, and manage the product catalog.

Requirements
To run this project, you need the following tools installed:

Java 17 (or higher)
Node.js (with npm)
PostgreSQL
Backend (Spring Boot)
The backend is written in Java using the Spring Boot framework. It provides a REST API for communication with the frontend and manages the database.

Database Configuration
The project uses PostgreSQL as the database. Make sure you have PostgreSQL installed and configure the appropriate connection parameters in the application.properties file.

Running the Backend
Open a terminal and navigate to the backend project directory.
Run the Spring Boot application using the command: ./gradlew bootRun
The backend will be running on the default port 8080.

Frontend (React)
The frontend is written in JavaScript using the React library. It handles user interactions, data presentation, and communicates with the backend through the REST API.

Installing Dependencies
Open a terminal and navigate to the frontend project directory.
Install dependencies using the command: npm install
Running the Frontend
Still in the terminal and in the frontend project directory, start the React application using the command: npm start
The frontend will be running on port 3000.

Connecting Frontend and Backend
To enable communication between the frontend and backend, make sure the backend's address and port are correctly configured in the frontend's configuration file (e.g., src/config.js). For example, if the backend is running on port 8080 on the local host, you can set backendUrl to http://localhost:8080.

Features
The online store project includes the following features:

Browsing the product catalog
Adding products to the shopping cart
Editing and deleting products (available only to administrators)
Checkout process and placing orders
Managing the product catalog (available only to administrators)
Support and Improvements
The project is actively developed and improved. If you have any suggestions or find any issues, please submit them in the project repository on GitHub.

# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run eject`

**Note: this is a one-way operation. Once you `eject`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you're on your own.

You don't have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature. However we understand that this tool wouldn't be useful if you couldn't customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### Analyzing the Bundle Size

This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size)

### Making a Progressive Web App

This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app)

### Advanced Configuration

This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration)

### Deployment

This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment)

### `npm run build` fails to minify

This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify)
