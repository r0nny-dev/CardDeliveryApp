package model;

public class Person {
    private Long id;
    private String name;
    private String document; 
    private PersonType type;
    
    //Constant values
    private static final int CPF_SIZE = 11;
    private static final int CNPJ_SIZE = 14;
    
    //Enum Person Type
    public enum PersonType {FISICA,JURIDICA}    
    
    
    
    //This method setDocumento validates values, assigning an Física or Jurídica.    
    public void setDocumento(String document) {
        if (document == null || document.isEmpty()){
            throw new RuntimeException("Document cannot be null or empty");
        }

        if (document.length() == CPF_SIZE){
            setDocumento(document, type.FISICA);
        }else if (document.length() == CNPJ_SIZE){
            setDocumento(document, type.JURIDICA);
        }else {
            throw new RuntimeException("Invalid document for Física or Jurídica");
        }
    }

    private void setDocumento(String document, PersonType type){
        this.document = document;
        this.type = type; 
    }

    //Getters And Setters.
    public PersonType getType() {return type;}    

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public String getDocumento() {return document;}
}
