import React, { useState, useEffect } from "react";
import EmployeeService from "../services/EmployeeService";

const EmployeeComponent = () => {
  const [employees, setEmployees] = useState([]);

  const getEmployees = () => {
    EmployeeService.getEmployee().then((response) => {
      setEmployees(response.data);
      console.log(response.data);
    });
  };

  useEffect(() => {
    getEmployees();
  }, []);

  return (
    <div>
      <div className="container">
        <h1 className="text-center">List of employees</h1>
        <table className="table table-striped">
          <thead>
            <tr>
              <th>Serial ID</th>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Email</th>
            </tr>
          </thead>
          <tbody>
            {employees.map((employee) => (
              <tr key={employee.id}>
                <td>{employee.id}</td>
                <td>{employee.firstName}</td>
                <td>{employee.lastName}</td>
                <td>{employee.email}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default EmployeeComponent;
