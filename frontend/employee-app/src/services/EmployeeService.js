import axios from "axios";

const EMPLOYEE_REST_URL = "http://localhost:8080/api/v1/employees";

class EmployeeService {
  getEmployee() {
    return axios.get(EMPLOYEE_REST_URL);
  }
}

export default new EmployeeService();
