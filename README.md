# Fleet-Management
## Running the Application

1. Clone the repository and navigate to the project directory.
2. Run `mvn spring-boot:run` to start the application.

## API Endpoints

1. **Add a Bus**
   - 
   - Request Body:
     ```json
     {
       "busNumber": "123",
       "capacity": 50
     }
     ```

2. **Assign Route to Bus**
   - `/buses/{id}/route/{routeId}`
   - URL Parameters: 
     - `id`: The ID of the bus.
     - `routeId`: The ID of the route.

3. **Assign Driver to Bus**
   - `/buses/{id}/driver/{driverId}`
   - URL Parameters:
     - `id`: The ID of the bus.
     - `driverId`: The ID of the driver.
   
