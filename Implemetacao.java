// Interface Reproducible
interface Reproducible {
    void play();
    void pause();
    void stop();
}

// Classe Phone
class Phone {
    public void makeCall(String phoneNumber) {
        // Implementação da funcionalidade de fazer uma ligação
    }

    public void receiveCall(String callerName) {
        // Implementação da funcionalidade de receber uma ligação
    }
}

// Classe Browser
class Browser {
    public void openURL(String url) {
        // Implementação da funcionalidade de abrir uma URL no navegador
    }

    public void browseWeb() {
        // Implementação da funcionalidade de navegar na web
    }
}

// Classe iPhone que combina as funcionalidades de Phone, Browser e Reproducible
class iPhone implements Reproducible {
    private Phone phone;
    private Browser browser;

    public iPhone() {
        phone = new Phone();
        browser = new Browser();
    }

    // Implementação dos métodos da interface Reproducible
    public void play() {
        // Implementação da reprodução de música
    }

    public void pause() {
        // Implementação da pausa da reprodução de música
    }

    public void stop() {
        // Implementação da parada da reprodução de música
    }
}
