 class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

     public double getImaginary() {
         return imaginary;
     }
     public void Add(double real,double imaginary){
        ComplexNumber temp = new ComplexNumber(real,imaginary);
        this.real = this.real+temp.getReal();
        this.imaginary = this.imaginary+temp.getImaginary();
     }
     public void Add(ComplexNumber c){
        this.real = c.getReal()+this.real;
        this.imaginary = c.getImaginary()+this.imaginary;
     }

     public void Sub(double real,double imaginary){
        ComplexNumber temp = new ComplexNumber(real,imaginary);
        this.real = this.real+temp.getReal();
        this.imaginary = this.imaginary+temp.getImaginary();
     }
     public void Sub(ComplexNumber c){
        this.real = c.getReal()+this.real;
        this.imaginary = c.getImaginary()+this.imaginary;
     }

 }
