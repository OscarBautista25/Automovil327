public class Automovil {

    String marca;
    int modelo;
    int motor;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    int velocidadActual = 0;

    enum tipoCom {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    tipoCom tipoCombustible;

    enum tipoAuto {
        SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    tipoAuto tipoAutomovil;

    enum tipoColor {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    tipoColor color;

    public Automovil(String marca, int modelo, int motor, int numeroPuertas, int cantidadAsientos, int velocidadMaxima,
            Automovil.tipoCom tipoCombustible, Automovil.tipoAuto tipoAutomovil, Automovil.tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoAuto getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(tipoAuto tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    void acelerar(int incrementoVelocidad){
        if (velocidadActual+incrementoVelocidad<velocidadMaxima) {
            velocidadActual=velocidadActual+incrementoVelocidad;
        } else {
            System.out.println("No se puede subir a una velocidad más alta que la máxima");
        }
    }

    void desacelerar(int decrementoVelocidad){
        if (velocidadActual-decrementoVelocidad>0) {
            velocidadActual=velocidadActual-decrementoVelocidad;
        } else {
            System.out.println("No se bajar la velocidad en valores menores a 0");
        }
    }
    void frenar(){
        velocidadActual=0;
    }

    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }

    void imprimir(){
        System.out.println("Marca = " +marca);
        System.out.println("Modelo = " +modelo);
        System.out.println("Motor = " +motor);
        System.out.println("Cantidad de asientos = " +cantidadAsientos);
        System.out.println("Numero de puertas = " +numeroPuertas);
        System.out.println("Velocidad máxima = " +velocidadMaxima);
        System.out.println("Tipo de Combustible = " +tipoCombustible);
        System.out.println("Tipo de Automovil = " +tipoAutomovil);
        System.out.println("Color = " +color);
    }
        public static void main(String[] args) {
            Automovil auto1 = new Automovil("Ford", 2018, 3, 5, 6, 250, tipoCom.DIESEL, tipoAuto.EJECUTIVO, tipoColor.NEGRO);
            auto1.imprimir();
            auto1.setVelocidadActual(100);
            System.out.println("Velocidad Actual = " +auto1.velocidadActual);
            auto1.acelerar(20);
            System.out.println("Velocidad Actual = " +auto1.velocidadActual);
            auto1.desacelerar(50);
            System.out.println("Velocidad Actual = " +auto1.velocidadActual);
            auto1.frenar();
            System.out.println("Velocidad Actual = " +auto1.velocidadActual);
            auto1.desacelerar(10);
            System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        }
    }

    


    

