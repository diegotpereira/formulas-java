package br.com.java.threads;

public class threads {
	
	class TarefaImprimeOi implements Runnable{

		@Override
		public void run() {
			for(int index = 0; index < 100; index++) {
				System.out.println("Oi");
			}
		}
	}

	class TarefaSomaAte100 implements Runnable {

		@Override
		public void run() {
			int soma = 0;
			for(int index = 0; index <= 100; index++) {
				soma += 1;
			}
			System.out.println(soma);
			
		}
	}

	TarefaImprimeOi tarefa1 = new TarefaImprimeOi();
	TarefaImprimeOi tarefa2 = new TarefaImprimeOi();
	TarefaSomaAte100 tarefa3 = new TarefaSomaAte100();

	Thread thread1 = new Thread(tarefa1);
	Thread thread2 = new Thread(tarefa2);
	Thread thread3 = new Thread(tarefa3);

	TarefaImprimeOi tarefa = new TarefaImprimeOi();
	Thread thread = new Thread(tarefa);
	//thread.start();
}
