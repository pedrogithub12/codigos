package ControleReserva;

import java.util.ArrayDeque;
import java.util.Queue;

public class ControleReserva {
    private Queue<Reserva> reservas = new ArrayDeque<Reserva>();

    public void novaReserva(Reserva reserva) {
        reservas.offer(reserva);

    }

    public void listar() {

        System.out.println("Fila -->");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
        
    }

    public Reserva proximo() {
        return reservas.poll();
    }
}
