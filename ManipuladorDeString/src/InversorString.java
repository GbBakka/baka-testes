public class InversorString implements ManipuladorString {
    @Override
    public String manipular(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder invertida  = new StringBuilder(string);
        return invertida.reverse().toString();
    }
}
