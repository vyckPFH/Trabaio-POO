public class sla {
    public static void main(String[] args) {
        String textoOriginal = "Texto para riscar";
        String taxado = "\u001b[9mtexto\u001b[0m";
        String textoFormatado = String.format("<del>%s</del>", textoOriginal + taxado);
        System.out.println(textoFormatado); // Saída: <del>Texto para riscar</del>
    }
}
