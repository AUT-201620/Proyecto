package dialect;
import org.hibernate.dialect.PostgreSQL82Dialect;


public class ImprovedDialect extends PostgreSQL82Dialect
{
    @Override
    public String getDropSequenceString(String sequenceName) {
        return "drop sequence if exists " + sequenceName;
    }

    @Override
    public boolean dropConstraints() {
        return false;
    }
}