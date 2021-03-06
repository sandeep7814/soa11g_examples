package nl.whitehorses.soa.model.hr.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 100408.1504.05443)

@WebService(targetNamespace="http://services.hr.model.soa.whitehorses.nl/",
  name="HrSessionBeanService")
@XmlSeeAlso(
  { nl.whitehorses.soa.model.hr.services.ObjectFactory.class })
public interface HrSessionBeanService
{
  @WebMethod
  @Action(input="http://services.hr.model.soa.whitehorses.nl/HrSessionBeanService/getEmployeesFindOneRequest",
    output="http://services.hr.model.soa.whitehorses.nl/HrSessionBeanService/getEmployeesFindOneResponse")
  @ResponseWrapper(localName="getEmployeesFindOneResponse",
    targetNamespace="http://services.hr.model.soa.whitehorses.nl/",
    className="nl.whitehorses.soa.model.hr.services.GetEmployeesFindOneResponse")
  @RequestWrapper(localName="getEmployeesFindOne", targetNamespace="http://services.hr.model.soa.whitehorses.nl/",
    className="nl.whitehorses.soa.model.hr.services.GetEmployeesFindOne")
  @WebResult(targetNamespace="", name="employee")
  public nl.whitehorses.soa.model.hr.services.Employees getEmployeesFindOne(@WebParam(targetNamespace="",
      name="empId")
    long empId);

  @WebMethod
  @Action(input="http://services.hr.model.soa.whitehorses.nl/HrSessionBeanService/getDepartmentsFindOneRequest",
    output="http://services.hr.model.soa.whitehorses.nl/HrSessionBeanService/getDepartmentsFindOneResponse")
  @ResponseWrapper(localName="getDepartmentsFindOneResponse",
    targetNamespace="http://services.hr.model.soa.whitehorses.nl/",
    className="nl.whitehorses.soa.model.hr.services.GetDepartmentsFindOneResponse")
  @RequestWrapper(localName="getDepartmentsFindOne", targetNamespace="http://services.hr.model.soa.whitehorses.nl/",
    className="nl.whitehorses.soa.model.hr.services.GetDepartmentsFindOne")
  @WebResult(targetNamespace="", name="department")
  public nl.whitehorses.soa.model.hr.services.Departments getDepartmentsFindOne(@WebParam(targetNamespace="",
      name="deptId")
    long deptId);
}
