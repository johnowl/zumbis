package com.johnowl.components.exercises;

public class ClientComponent implements IClient {

    public final static int STANDARD_SIZE = 5;

    private int size;
    private int first, second;

    private IStatistics provider = null;

    public ClientComponent() {
        super();
        size = STANDARD_SIZE;
        first = 1;
        second = 1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void connect(IStatistics provider)
    {
        this.provider = provider;
    }

    public int next() {
        int returnNumber = first;
        first = second;
        second = returnNumber + first;
        return returnNumber;
    }

    public void start()
    {
        for (int f = 1; f <= size; f++) {
            int nextNumber = next();
            System.out.println("produzido: " + nextNumber);
            provider.insertValue(nextNumber);
        }

        System.out.println("-- somatorio: " + provider.sum());
        System.out.println("-- media: " + provider.average());
    }

}
