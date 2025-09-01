public class RemovedorEspacosExtras implements ManipuladorString {
    @Override
    public String manipular(String string) {
            if (string == null) {
                return null;
            }
            return string.trim();
        }
    }
