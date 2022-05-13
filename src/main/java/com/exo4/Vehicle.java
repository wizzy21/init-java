package com.exo4;

public abstract class Vehicle {

    protected float currentGas;
    protected float gasCapacity;
    protected float gasConsumption;
    protected int speed;
    protected int passengerCapcity;



    // GETTERS AND SETTERS
    public float getCurrentGas() {
        return currentGas;
    }

    public void setCurrentGas(float currentGas) {
        this.currentGas = currentGas;
    }

    public float getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(float gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public float getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(float gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPassengerCapcity() {
        return passengerCapcity;
    }

    public void setPassengerCapcity(int passengerCapcity) {
        this.passengerCapcity = passengerCapcity;
    }




    // METHODS

    //Methods movement
    public void start(){
        System.out.println("The car is started");
    }

    public abstract void accelerate();

    public abstract void brake();

    public void refuel(){
        // capacity of fuel
        currentGas = gasCapacity;
    }


    public void drive()throws Exception {

        if (currentGas < gasConsumption) {
            throw new Exception("Your fuel tank is empty");
        }
            accelerate();
        float consumption =  (gasConsumption * speed) / 100;
        currentGas -= (gasConsumption * speed) / 100;

            System.out.println(String.format("Your car has consumed:  %.2f L " + consumption+ " L"));
        }







/*
    public void stop() {
        System.out.println("The car is stopped");

    }
        // Mehtods technics
   public void refuel() {
       currentGas* gasCapacity;
   }


        // The abstract methods
        public abstract void fixMotor();
        // The public methods
    }



*/

    }