# Fleet-Management
## Running the Application

1. Clone the repository and navigate to the project directory.
2. Run `mvn spring-boot:run` to start the application.

##h2-database
"name"="sr"
"password"="pass123"

## API Endpoints

1. **Add a Bus**
   - 
   - Request Body:
     ```json
     {
       "busNumber": "KA23F2024",
       "capacity":60
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
    
##postman Collection

- [Download Postman Collection](https://h11111-5524.postman.co/workspace/test~ded8357b-a693-49e5-ba6f-d6b95d0d080a/collection/37403541-579fd142-db32-49ee-a945-c1cb7a4bf338?action=share&creator=37403541)

   
