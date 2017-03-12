package com.korol.homeworks.homework4.task24;

public class ChainOfHandlers {
    public static Handler getChainOfHandlers() {
        Handler fixingHandler = new FixingHandler();
        Handler monitoringHandler = new MonitoringHandler();
        Handler taxHandler = new TaxHandler();
        Handler finishHandler = new FinishHandler();

        fixingHandler.setNextHandler(monitoringHandler);
        monitoringHandler.setNextHandler(taxHandler);
        taxHandler.setNextHandler(finishHandler);

        return fixingHandler;
    }

    public static void main(String[] args) {
        Payment payment = new Payment(1000, PaymentType.NORMAL);
        Handler handlers = getChainOfHandlers();
        handlers.handlePayment(payment);
    }
}
