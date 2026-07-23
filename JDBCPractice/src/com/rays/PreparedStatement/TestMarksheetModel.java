package com.rays.PreparedStatement;

public class TestMarksheetModel {
	
	public static void main(String[] args) {
		
        testAdd();
        testUpdate();
        testDelete();
        testFindByRollNo();
        testFindByPk();
    
		
	}
	public static void testAdd() {

        MarksheetModel model = new MarksheetModel();

        Marksheetbean bean = new Marksheetbean();

        bean.setId(12);
        bean.setRollNo(112);
        bean.setName("Rahul");
        bean.setPhy(80);
        bean.setChm(75);
        bean.setMaths(90);
        
        model.add(bean);

        System.out.println("Record Inserted");
    }
	
	public static void testUpdate() {

        MarksheetModel model = new MarksheetModel();

        Marksheetbean bean = new Marksheetbean();

        bean.setId(1);
        bean.setRollNo(101);
        bean.setName("Rahul Sharma");
        bean.setPhy(88);
        bean.setChm(82);
        bean.setMaths(95);

        model.update(bean);

        System.out.println("Record Updated");
        
	}
	
	
	 public static void testDelete() {

	        MarksheetModel model = new MarksheetModel();

	        Marksheetbean bean = new Marksheetbean();

	        bean.setId(1);

	        model.delete(bean);

	        System.out.println("Record Deleted");
	        
	        
	    }
	 
	 
	 
	 public static void testFindByRollNo() {

	        MarksheetModel model = new MarksheetModel();

	        Marksheetbean bean = model.findByRollNo(101);

	        if (bean != null) {

	            System.out.println("ID = " + bean.getId());
	            System.out.println("Roll No = " + bean.getRollNo());
	            System.out.println("Name = " + bean.getName());
	            System.out.println("Physics = " + bean.getPhy());
	            System.out.println("Chemistry = " + bean.getChm());
	            System.out.println("Maths = " + bean.getMaths());

	        } else {
	            System.out.println("Record Not Found");
	            
	        }
	        
	 }
	        
	        public static void testFindByPk() {

	            MarksheetModel model = new MarksheetModel();

	            Marksheetbean bean = model.findByPk(1);

	            if (bean != null) {

	                System.out.println("ID = " + bean.getId());
	                System.out.println("Roll No = " + bean.getRollNo());
	                System.out.println("Name = " + bean.getName());
	                System.out.println("Physics = " + bean.getPhy());
	                System.out.println("Chemistry = " + bean.getChm());
	                System.out.println("Maths = " + bean.getMaths());

	            } else {
	                System.out.println("Record Not Found");
	            }

	    }
  

}
