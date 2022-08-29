public class Transaction {
    @id
    private long id;

    private string concept;

    private float amount;

    public Transaction(long id, string concept, float amount) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public string getConcept() {
        return concept;
    }

    public void setConcept(string concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
