package com.m11n.hermes.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.GenericGenerator;
import org.joda.beans.*;
import org.joda.beans.impl.direct.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
@JsonIgnoreProperties({"meta", "metaBean"})
@XmlRootElement(name = "bank_statement")
@Entity
@Table(name = "hermes_bank_statement")
public class BankStatement extends DirectBean
{
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("uuid")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "uuid", unique = true)
    private String id;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "hash")
    private String hash;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "order_id")
    private String orderId;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Transient
    private List<String> orderIds;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Transient
    private Boolean skipWebservice;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "invoice_id")
    private String invoiceId;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "client_id")
    private String clientId;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "firstname")
    private String firstname;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "lastname")
    private String lastname;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "customer_id")
    private String customerId;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "ebay_name")
    private String ebayName;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "account")
    private String account;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Transient
    private Date orderDate;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "transfer_date")
    private Date transferDate;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "valuta_date")
    private Date valutaDate;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "changed_at")
    private Date changedAt = new Date();

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "receiver1")
    private String receiver1;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "receiver2")
    private String receiver2;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "description", length = 4096)
    private String description;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "description_b", length = 4096)
    private String descriptionb;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "comments")
    private String comments;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "amount", precision = 8, scale = 2)
    private BigDecimal amount;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "amount_order", precision = 8, scale = 2)
    private BigDecimal amountOrder;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "amount_diff", precision = 8, scale = 2)
    private BigDecimal amountDiff;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "currency")
    private String currency;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "status")
    private String status = "new";

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "matching", precision = 8, scale = 2)
    private BigDecimal matching = new BigDecimal(0.0d).setScale(2, BigDecimal.ROUND_HALF_EVEN);

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code BankStatement}.
     * @return the meta-bean, not null
     */
    public static BankStatement.Meta meta() {
        return BankStatement.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(BankStatement.Meta.INSTANCE);
    }

    @Override
    public BankStatement.Meta metaBean() {
        return BankStatement.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the id.
     * @return the value of the property
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id  the new value of the property
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the the {@code id} property.
     * @return the property, not null
     */
    public final Property<String> id() {
        return metaBean().id().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the hash.
     * @return the value of the property
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the hash.
     * @param hash  the new value of the property
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Gets the the {@code hash} property.
     * @return the property, not null
     */
    public final Property<String> hash() {
        return metaBean().hash().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the orderId.
     * @return the value of the property
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the orderId.
     * @param orderId  the new value of the property
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets the the {@code orderId} property.
     * @return the property, not null
     */
    public final Property<String> orderId() {
        return metaBean().orderId().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the orderIds.
     * @return the value of the property
     */
    public List<String> getOrderIds() {
        return orderIds;
    }

    /**
     * Sets the orderIds.
     * @param orderIds  the new value of the property
     */
    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    /**
     * Gets the the {@code orderIds} property.
     * @return the property, not null
     */
    public final Property<List<String>> orderIds() {
        return metaBean().orderIds().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the skipWebservice.
     * @return the value of the property
     */
    public Boolean getSkipWebservice() {
        return skipWebservice;
    }

    /**
     * Sets the skipWebservice.
     * @param skipWebservice  the new value of the property
     */
    public void setSkipWebservice(Boolean skipWebservice) {
        this.skipWebservice = skipWebservice;
    }

    /**
     * Gets the the {@code skipWebservice} property.
     * @return the property, not null
     */
    public final Property<Boolean> skipWebservice() {
        return metaBean().skipWebservice().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the invoiceId.
     * @return the value of the property
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the invoiceId.
     * @param invoiceId  the new value of the property
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Gets the the {@code invoiceId} property.
     * @return the property, not null
     */
    public final Property<String> invoiceId() {
        return metaBean().invoiceId().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the clientId.
     * @return the value of the property
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the clientId.
     * @param clientId  the new value of the property
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Gets the the {@code clientId} property.
     * @return the property, not null
     */
    public final Property<String> clientId() {
        return metaBean().clientId().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the firstname.
     * @return the value of the property
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the firstname.
     * @param firstname  the new value of the property
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets the the {@code firstname} property.
     * @return the property, not null
     */
    public final Property<String> firstname() {
        return metaBean().firstname().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the lastname.
     * @return the value of the property
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the lastname.
     * @param lastname  the new value of the property
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets the the {@code lastname} property.
     * @return the property, not null
     */
    public final Property<String> lastname() {
        return metaBean().lastname().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the customerId.
     * @return the value of the property
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the customerId.
     * @param customerId  the new value of the property
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the the {@code customerId} property.
     * @return the property, not null
     */
    public final Property<String> customerId() {
        return metaBean().customerId().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the ebayName.
     * @return the value of the property
     */
    public String getEbayName() {
        return ebayName;
    }

    /**
     * Sets the ebayName.
     * @param ebayName  the new value of the property
     */
    public void setEbayName(String ebayName) {
        this.ebayName = ebayName;
    }

    /**
     * Gets the the {@code ebayName} property.
     * @return the property, not null
     */
    public final Property<String> ebayName() {
        return metaBean().ebayName().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the account.
     * @return the value of the property
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the account.
     * @param account  the new value of the property
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Gets the the {@code account} property.
     * @return the property, not null
     */
    public final Property<String> account() {
        return metaBean().account().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the orderDate.
     * @return the value of the property
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the orderDate.
     * @param orderDate  the new value of the property
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Gets the the {@code orderDate} property.
     * @return the property, not null
     */
    public final Property<Date> orderDate() {
        return metaBean().orderDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the transferDate.
     * @return the value of the property
     */
    public Date getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the transferDate.
     * @param transferDate  the new value of the property
     */
    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    /**
     * Gets the the {@code transferDate} property.
     * @return the property, not null
     */
    public final Property<Date> transferDate() {
        return metaBean().transferDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valutaDate.
     * @return the value of the property
     */
    public Date getValutaDate() {
        return valutaDate;
    }

    /**
     * Sets the valutaDate.
     * @param valutaDate  the new value of the property
     */
    public void setValutaDate(Date valutaDate) {
        this.valutaDate = valutaDate;
    }

    /**
     * Gets the the {@code valutaDate} property.
     * @return the property, not null
     */
    public final Property<Date> valutaDate() {
        return metaBean().valutaDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the changedAt.
     * @return the value of the property
     */
    public Date getChangedAt() {
        return changedAt;
    }

    /**
     * Sets the changedAt.
     * @param changedAt  the new value of the property
     */
    public void setChangedAt(Date changedAt) {
        this.changedAt = changedAt;
    }

    /**
     * Gets the the {@code changedAt} property.
     * @return the property, not null
     */
    public final Property<Date> changedAt() {
        return metaBean().changedAt().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the receiver1.
     * @return the value of the property
     */
    public String getReceiver1() {
        return receiver1;
    }

    /**
     * Sets the receiver1.
     * @param receiver1  the new value of the property
     */
    public void setReceiver1(String receiver1) {
        this.receiver1 = receiver1;
    }

    /**
     * Gets the the {@code receiver1} property.
     * @return the property, not null
     */
    public final Property<String> receiver1() {
        return metaBean().receiver1().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the receiver2.
     * @return the value of the property
     */
    public String getReceiver2() {
        return receiver2;
    }

    /**
     * Sets the receiver2.
     * @param receiver2  the new value of the property
     */
    public void setReceiver2(String receiver2) {
        this.receiver2 = receiver2;
    }

    /**
     * Gets the the {@code receiver2} property.
     * @return the property, not null
     */
    public final Property<String> receiver2() {
        return metaBean().receiver2().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the description.
     * @return the value of the property
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * @param description  the new value of the property
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the the {@code description} property.
     * @return the property, not null
     */
    public final Property<String> description() {
        return metaBean().description().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the descriptionb.
     * @return the value of the property
     */
    public String getDescriptionb() {
        return descriptionb;
    }

    /**
     * Sets the descriptionb.
     * @param descriptionb  the new value of the property
     */
    public void setDescriptionb(String descriptionb) {
        this.descriptionb = descriptionb;
    }

    /**
     * Gets the the {@code descriptionb} property.
     * @return the property, not null
     */
    public final Property<String> descriptionb() {
        return metaBean().descriptionb().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the comments.
     * @return the value of the property
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the comments.
     * @param comments  the new value of the property
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Gets the the {@code comments} property.
     * @return the property, not null
     */
    public final Property<String> comments() {
        return metaBean().comments().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the amount.
     * @return the value of the property
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     * @param amount  the new value of the property
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Gets the the {@code amount} property.
     * @return the property, not null
     */
    public final Property<BigDecimal> amount() {
        return metaBean().amount().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the amountOrder.
     * @return the value of the property
     */
    public BigDecimal getAmountOrder() {
        return amountOrder;
    }

    /**
     * Sets the amountOrder.
     * @param amountOrder  the new value of the property
     */
    public void setAmountOrder(BigDecimal amountOrder) {
        this.amountOrder = amountOrder;
    }

    /**
     * Gets the the {@code amountOrder} property.
     * @return the property, not null
     */
    public final Property<BigDecimal> amountOrder() {
        return metaBean().amountOrder().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the amountDiff.
     * @return the value of the property
     */
    public BigDecimal getAmountDiff() {
        return amountDiff;
    }

    /**
     * Sets the amountDiff.
     * @param amountDiff  the new value of the property
     */
    public void setAmountDiff(BigDecimal amountDiff) {
        this.amountDiff = amountDiff;
    }

    /**
     * Gets the the {@code amountDiff} property.
     * @return the property, not null
     */
    public final Property<BigDecimal> amountDiff() {
        return metaBean().amountDiff().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the currency.
     * @return the value of the property
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the currency.
     * @param currency  the new value of the property
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets the the {@code currency} property.
     * @return the property, not null
     */
    public final Property<String> currency() {
        return metaBean().currency().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the status.
     * @return the value of the property
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * @param status  the new value of the property
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the the {@code status} property.
     * @return the property, not null
     */
    public final Property<String> status() {
        return metaBean().status().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the matching.
     * @return the value of the property
     */
    public BigDecimal getMatching() {
        return matching;
    }

    /**
     * Sets the matching.
     * @param matching  the new value of the property
     */
    public void setMatching(BigDecimal matching) {
        this.matching = matching;
    }

    /**
     * Gets the the {@code matching} property.
     * @return the property, not null
     */
    public final Property<BigDecimal> matching() {
        return metaBean().matching().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public BankStatement clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            BankStatement other = (BankStatement) obj;
            return JodaBeanUtils.equal(getId(), other.getId()) &&
                    JodaBeanUtils.equal(getHash(), other.getHash()) &&
                    JodaBeanUtils.equal(getOrderId(), other.getOrderId()) &&
                    JodaBeanUtils.equal(getOrderIds(), other.getOrderIds()) &&
                    JodaBeanUtils.equal(getSkipWebservice(), other.getSkipWebservice()) &&
                    JodaBeanUtils.equal(getInvoiceId(), other.getInvoiceId()) &&
                    JodaBeanUtils.equal(getClientId(), other.getClientId()) &&
                    JodaBeanUtils.equal(getFirstname(), other.getFirstname()) &&
                    JodaBeanUtils.equal(getLastname(), other.getLastname()) &&
                    JodaBeanUtils.equal(getCustomerId(), other.getCustomerId()) &&
                    JodaBeanUtils.equal(getEbayName(), other.getEbayName()) &&
                    JodaBeanUtils.equal(getAccount(), other.getAccount()) &&
                    JodaBeanUtils.equal(getOrderDate(), other.getOrderDate()) &&
                    JodaBeanUtils.equal(getTransferDate(), other.getTransferDate()) &&
                    JodaBeanUtils.equal(getValutaDate(), other.getValutaDate()) &&
                    JodaBeanUtils.equal(getChangedAt(), other.getChangedAt()) &&
                    JodaBeanUtils.equal(getReceiver1(), other.getReceiver1()) &&
                    JodaBeanUtils.equal(getReceiver2(), other.getReceiver2()) &&
                    JodaBeanUtils.equal(getDescription(), other.getDescription()) &&
                    JodaBeanUtils.equal(getDescriptionb(), other.getDescriptionb()) &&
                    JodaBeanUtils.equal(getComments(), other.getComments()) &&
                    JodaBeanUtils.equal(getAmount(), other.getAmount()) &&
                    JodaBeanUtils.equal(getAmountOrder(), other.getAmountOrder()) &&
                    JodaBeanUtils.equal(getAmountDiff(), other.getAmountDiff()) &&
                    JodaBeanUtils.equal(getCurrency(), other.getCurrency()) &&
                    JodaBeanUtils.equal(getStatus(), other.getStatus()) &&
                    JodaBeanUtils.equal(getMatching(), other.getMatching());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getHash());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOrderId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOrderIds());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSkipWebservice());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInvoiceId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getClientId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFirstname());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLastname());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCustomerId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEbayName());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAccount());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOrderDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTransferDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getValutaDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getChangedAt());
        hash = hash * 31 + JodaBeanUtils.hashCode(getReceiver1());
        hash = hash * 31 + JodaBeanUtils.hashCode(getReceiver2());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDescription());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDescriptionb());
        hash = hash * 31 + JodaBeanUtils.hashCode(getComments());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAmount());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAmountOrder());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAmountDiff());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCurrency());
        hash = hash * 31 + JodaBeanUtils.hashCode(getStatus());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMatching());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(896);
        buf.append("BankStatement{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("id").append('=').append(JodaBeanUtils.toString(getId())).append(',').append(' ');
        buf.append("hash").append('=').append(JodaBeanUtils.toString(getHash())).append(',').append(' ');
        buf.append("orderId").append('=').append(JodaBeanUtils.toString(getOrderId())).append(',').append(' ');
        buf.append("orderIds").append('=').append(JodaBeanUtils.toString(getOrderIds())).append(',').append(' ');
        buf.append("skipWebservice").append('=').append(JodaBeanUtils.toString(getSkipWebservice())).append(',').append(' ');
        buf.append("invoiceId").append('=').append(JodaBeanUtils.toString(getInvoiceId())).append(',').append(' ');
        buf.append("clientId").append('=').append(JodaBeanUtils.toString(getClientId())).append(',').append(' ');
        buf.append("firstname").append('=').append(JodaBeanUtils.toString(getFirstname())).append(',').append(' ');
        buf.append("lastname").append('=').append(JodaBeanUtils.toString(getLastname())).append(',').append(' ');
        buf.append("customerId").append('=').append(JodaBeanUtils.toString(getCustomerId())).append(',').append(' ');
        buf.append("ebayName").append('=').append(JodaBeanUtils.toString(getEbayName())).append(',').append(' ');
        buf.append("account").append('=').append(JodaBeanUtils.toString(getAccount())).append(',').append(' ');
        buf.append("orderDate").append('=').append(JodaBeanUtils.toString(getOrderDate())).append(',').append(' ');
        buf.append("transferDate").append('=').append(JodaBeanUtils.toString(getTransferDate())).append(',').append(' ');
        buf.append("valutaDate").append('=').append(JodaBeanUtils.toString(getValutaDate())).append(',').append(' ');
        buf.append("changedAt").append('=').append(JodaBeanUtils.toString(getChangedAt())).append(',').append(' ');
        buf.append("receiver1").append('=').append(JodaBeanUtils.toString(getReceiver1())).append(',').append(' ');
        buf.append("receiver2").append('=').append(JodaBeanUtils.toString(getReceiver2())).append(',').append(' ');
        buf.append("description").append('=').append(JodaBeanUtils.toString(getDescription())).append(',').append(' ');
        buf.append("descriptionb").append('=').append(JodaBeanUtils.toString(getDescriptionb())).append(',').append(' ');
        buf.append("comments").append('=').append(JodaBeanUtils.toString(getComments())).append(',').append(' ');
        buf.append("amount").append('=').append(JodaBeanUtils.toString(getAmount())).append(',').append(' ');
        buf.append("amountOrder").append('=').append(JodaBeanUtils.toString(getAmountOrder())).append(',').append(' ');
        buf.append("amountDiff").append('=').append(JodaBeanUtils.toString(getAmountDiff())).append(',').append(' ');
        buf.append("currency").append('=').append(JodaBeanUtils.toString(getCurrency())).append(',').append(' ');
        buf.append("status").append('=').append(JodaBeanUtils.toString(getStatus())).append(',').append(' ');
        buf.append("matching").append('=').append(JodaBeanUtils.toString(getMatching())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code BankStatement}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code id} property.
         */
        private final MetaProperty<String> id = DirectMetaProperty.ofReadWrite(
                this, "id", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code hash} property.
         */
        private final MetaProperty<String> hash = DirectMetaProperty.ofReadWrite(
                this, "hash", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code orderId} property.
         */
        private final MetaProperty<String> orderId = DirectMetaProperty.ofReadWrite(
                this, "orderId", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code orderIds} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<String>> orderIds = DirectMetaProperty.ofReadWrite(
                this, "orderIds", BankStatement.class, (Class) List.class);
        /**
         * The meta-property for the {@code skipWebservice} property.
         */
        private final MetaProperty<Boolean> skipWebservice = DirectMetaProperty.ofReadWrite(
                this, "skipWebservice", BankStatement.class, Boolean.class);
        /**
         * The meta-property for the {@code invoiceId} property.
         */
        private final MetaProperty<String> invoiceId = DirectMetaProperty.ofReadWrite(
                this, "invoiceId", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code clientId} property.
         */
        private final MetaProperty<String> clientId = DirectMetaProperty.ofReadWrite(
                this, "clientId", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code firstname} property.
         */
        private final MetaProperty<String> firstname = DirectMetaProperty.ofReadWrite(
                this, "firstname", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code lastname} property.
         */
        private final MetaProperty<String> lastname = DirectMetaProperty.ofReadWrite(
                this, "lastname", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code customerId} property.
         */
        private final MetaProperty<String> customerId = DirectMetaProperty.ofReadWrite(
                this, "customerId", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code ebayName} property.
         */
        private final MetaProperty<String> ebayName = DirectMetaProperty.ofReadWrite(
                this, "ebayName", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code account} property.
         */
        private final MetaProperty<String> account = DirectMetaProperty.ofReadWrite(
                this, "account", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code orderDate} property.
         */
        private final MetaProperty<Date> orderDate = DirectMetaProperty.ofReadWrite(
                this, "orderDate", BankStatement.class, Date.class);
        /**
         * The meta-property for the {@code transferDate} property.
         */
        private final MetaProperty<Date> transferDate = DirectMetaProperty.ofReadWrite(
                this, "transferDate", BankStatement.class, Date.class);
        /**
         * The meta-property for the {@code valutaDate} property.
         */
        private final MetaProperty<Date> valutaDate = DirectMetaProperty.ofReadWrite(
                this, "valutaDate", BankStatement.class, Date.class);
        /**
         * The meta-property for the {@code changedAt} property.
         */
        private final MetaProperty<Date> changedAt = DirectMetaProperty.ofReadWrite(
                this, "changedAt", BankStatement.class, Date.class);
        /**
         * The meta-property for the {@code receiver1} property.
         */
        private final MetaProperty<String> receiver1 = DirectMetaProperty.ofReadWrite(
                this, "receiver1", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code receiver2} property.
         */
        private final MetaProperty<String> receiver2 = DirectMetaProperty.ofReadWrite(
                this, "receiver2", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code description} property.
         */
        private final MetaProperty<String> description = DirectMetaProperty.ofReadWrite(
                this, "description", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code descriptionb} property.
         */
        private final MetaProperty<String> descriptionb = DirectMetaProperty.ofReadWrite(
                this, "descriptionb", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code comments} property.
         */
        private final MetaProperty<String> comments = DirectMetaProperty.ofReadWrite(
                this, "comments", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code amount} property.
         */
        private final MetaProperty<BigDecimal> amount = DirectMetaProperty.ofReadWrite(
                this, "amount", BankStatement.class, BigDecimal.class);
        /**
         * The meta-property for the {@code amountOrder} property.
         */
        private final MetaProperty<BigDecimal> amountOrder = DirectMetaProperty.ofReadWrite(
                this, "amountOrder", BankStatement.class, BigDecimal.class);
        /**
         * The meta-property for the {@code amountDiff} property.
         */
        private final MetaProperty<BigDecimal> amountDiff = DirectMetaProperty.ofReadWrite(
                this, "amountDiff", BankStatement.class, BigDecimal.class);
        /**
         * The meta-property for the {@code currency} property.
         */
        private final MetaProperty<String> currency = DirectMetaProperty.ofReadWrite(
                this, "currency", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code status} property.
         */
        private final MetaProperty<String> status = DirectMetaProperty.ofReadWrite(
                this, "status", BankStatement.class, String.class);
        /**
         * The meta-property for the {@code matching} property.
         */
        private final MetaProperty<BigDecimal> matching = DirectMetaProperty.ofReadWrite(
                this, "matching", BankStatement.class, BigDecimal.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "id",
                "hash",
                "orderId",
                "orderIds",
                "skipWebservice",
                "invoiceId",
                "clientId",
                "firstname",
                "lastname",
                "customerId",
                "ebayName",
                "account",
                "orderDate",
                "transferDate",
                "valutaDate",
                "changedAt",
                "receiver1",
                "receiver2",
                "description",
                "descriptionb",
                "comments",
                "amount",
                "amountOrder",
                "amountDiff",
                "currency",
                "status",
                "matching");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return id;
                case 3195150:  // hash
                    return hash;
                case -1207110391:  // orderId
                    return orderId;
                case 1234283658:  // orderIds
                    return orderIds;
                case 834438080:  // skipWebservice
                    return skipWebservice;
                case -1739442904:  // invoiceId
                    return invoiceId;
                case 908408390:  // clientId
                    return clientId;
                case 133788987:  // firstname
                    return firstname;
                case -1458646495:  // lastname
                    return lastname;
                case -1581184615:  // customerId
                    return customerId;
                case -397573696:  // ebayName
                    return ebayName;
                case -1177318867:  // account
                    return account;
                case -392063972:  // orderDate
                    return orderDate;
                case -2143998407:  // transferDate
                    return transferDate;
                case -1821791697:  // valutaDate
                    return valutaDate;
                case 1455263239:  // changedAt
                    return changedAt;
                case 699487266:  // receiver1
                    return receiver1;
                case 699487267:  // receiver2
                    return receiver2;
                case -1724546052:  // description
                    return description;
                case -1921319962:  // descriptionb
                    return descriptionb;
                case -602415628:  // comments
                    return comments;
                case -1413853096:  // amount
                    return amount;
                case -1225736746:  // amountOrder
                    return amountOrder;
                case -1425349507:  // amountDiff
                    return amountDiff;
                case 575402001:  // currency
                    return currency;
                case -892481550:  // status
                    return status;
                case 296922109:  // matching
                    return matching;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends BankStatement> builder() {
            return new DirectBeanBuilder<BankStatement>(new BankStatement());
        }

        @Override
        public Class<? extends BankStatement> beanType() {
            return BankStatement.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code id} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> id() {
            return id;
        }

        /**
         * The meta-property for the {@code hash} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> hash() {
            return hash;
        }

        /**
         * The meta-property for the {@code orderId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> orderId() {
            return orderId;
        }

        /**
         * The meta-property for the {@code orderIds} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<String>> orderIds() {
            return orderIds;
        }

        /**
         * The meta-property for the {@code skipWebservice} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> skipWebservice() {
            return skipWebservice;
        }

        /**
         * The meta-property for the {@code invoiceId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> invoiceId() {
            return invoiceId;
        }

        /**
         * The meta-property for the {@code clientId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> clientId() {
            return clientId;
        }

        /**
         * The meta-property for the {@code firstname} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> firstname() {
            return firstname;
        }

        /**
         * The meta-property for the {@code lastname} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> lastname() {
            return lastname;
        }

        /**
         * The meta-property for the {@code customerId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> customerId() {
            return customerId;
        }

        /**
         * The meta-property for the {@code ebayName} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> ebayName() {
            return ebayName;
        }

        /**
         * The meta-property for the {@code account} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> account() {
            return account;
        }

        /**
         * The meta-property for the {@code orderDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> orderDate() {
            return orderDate;
        }

        /**
         * The meta-property for the {@code transferDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> transferDate() {
            return transferDate;
        }

        /**
         * The meta-property for the {@code valutaDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> valutaDate() {
            return valutaDate;
        }

        /**
         * The meta-property for the {@code changedAt} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> changedAt() {
            return changedAt;
        }

        /**
         * The meta-property for the {@code receiver1} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> receiver1() {
            return receiver1;
        }

        /**
         * The meta-property for the {@code receiver2} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> receiver2() {
            return receiver2;
        }

        /**
         * The meta-property for the {@code description} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> description() {
            return description;
        }

        /**
         * The meta-property for the {@code descriptionb} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> descriptionb() {
            return descriptionb;
        }

        /**
         * The meta-property for the {@code comments} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> comments() {
            return comments;
        }

        /**
         * The meta-property for the {@code amount} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<BigDecimal> amount() {
            return amount;
        }

        /**
         * The meta-property for the {@code amountOrder} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<BigDecimal> amountOrder() {
            return amountOrder;
        }

        /**
         * The meta-property for the {@code amountDiff} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<BigDecimal> amountDiff() {
            return amountDiff;
        }

        /**
         * The meta-property for the {@code currency} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> currency() {
            return currency;
        }

        /**
         * The meta-property for the {@code status} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> status() {
            return status;
        }

        /**
         * The meta-property for the {@code matching} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<BigDecimal> matching() {
            return matching;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((BankStatement) bean).getId();
                case 3195150:  // hash
                    return ((BankStatement) bean).getHash();
                case -1207110391:  // orderId
                    return ((BankStatement) bean).getOrderId();
                case 1234283658:  // orderIds
                    return ((BankStatement) bean).getOrderIds();
                case 834438080:  // skipWebservice
                    return ((BankStatement) bean).getSkipWebservice();
                case -1739442904:  // invoiceId
                    return ((BankStatement) bean).getInvoiceId();
                case 908408390:  // clientId
                    return ((BankStatement) bean).getClientId();
                case 133788987:  // firstname
                    return ((BankStatement) bean).getFirstname();
                case -1458646495:  // lastname
                    return ((BankStatement) bean).getLastname();
                case -1581184615:  // customerId
                    return ((BankStatement) bean).getCustomerId();
                case -397573696:  // ebayName
                    return ((BankStatement) bean).getEbayName();
                case -1177318867:  // account
                    return ((BankStatement) bean).getAccount();
                case -392063972:  // orderDate
                    return ((BankStatement) bean).getOrderDate();
                case -2143998407:  // transferDate
                    return ((BankStatement) bean).getTransferDate();
                case -1821791697:  // valutaDate
                    return ((BankStatement) bean).getValutaDate();
                case 1455263239:  // changedAt
                    return ((BankStatement) bean).getChangedAt();
                case 699487266:  // receiver1
                    return ((BankStatement) bean).getReceiver1();
                case 699487267:  // receiver2
                    return ((BankStatement) bean).getReceiver2();
                case -1724546052:  // description
                    return ((BankStatement) bean).getDescription();
                case -1921319962:  // descriptionb
                    return ((BankStatement) bean).getDescriptionb();
                case -602415628:  // comments
                    return ((BankStatement) bean).getComments();
                case -1413853096:  // amount
                    return ((BankStatement) bean).getAmount();
                case -1225736746:  // amountOrder
                    return ((BankStatement) bean).getAmountOrder();
                case -1425349507:  // amountDiff
                    return ((BankStatement) bean).getAmountDiff();
                case 575402001:  // currency
                    return ((BankStatement) bean).getCurrency();
                case -892481550:  // status
                    return ((BankStatement) bean).getStatus();
                case 296922109:  // matching
                    return ((BankStatement) bean).getMatching();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((BankStatement) bean).setId((String) newValue);
                    return;
                case 3195150:  // hash
                    ((BankStatement) bean).setHash((String) newValue);
                    return;
                case -1207110391:  // orderId
                    ((BankStatement) bean).setOrderId((String) newValue);
                    return;
                case 1234283658:  // orderIds
                    ((BankStatement) bean).setOrderIds((List<String>) newValue);
                    return;
                case 834438080:  // skipWebservice
                    ((BankStatement) bean).setSkipWebservice((Boolean) newValue);
                    return;
                case -1739442904:  // invoiceId
                    ((BankStatement) bean).setInvoiceId((String) newValue);
                    return;
                case 908408390:  // clientId
                    ((BankStatement) bean).setClientId((String) newValue);
                    return;
                case 133788987:  // firstname
                    ((BankStatement) bean).setFirstname((String) newValue);
                    return;
                case -1458646495:  // lastname
                    ((BankStatement) bean).setLastname((String) newValue);
                    return;
                case -1581184615:  // customerId
                    ((BankStatement) bean).setCustomerId((String) newValue);
                    return;
                case -397573696:  // ebayName
                    ((BankStatement) bean).setEbayName((String) newValue);
                    return;
                case -1177318867:  // account
                    ((BankStatement) bean).setAccount((String) newValue);
                    return;
                case -392063972:  // orderDate
                    ((BankStatement) bean).setOrderDate((Date) newValue);
                    return;
                case -2143998407:  // transferDate
                    ((BankStatement) bean).setTransferDate((Date) newValue);
                    return;
                case -1821791697:  // valutaDate
                    ((BankStatement) bean).setValutaDate((Date) newValue);
                    return;
                case 1455263239:  // changedAt
                    ((BankStatement) bean).setChangedAt((Date) newValue);
                    return;
                case 699487266:  // receiver1
                    ((BankStatement) bean).setReceiver1((String) newValue);
                    return;
                case 699487267:  // receiver2
                    ((BankStatement) bean).setReceiver2((String) newValue);
                    return;
                case -1724546052:  // description
                    ((BankStatement) bean).setDescription((String) newValue);
                    return;
                case -1921319962:  // descriptionb
                    ((BankStatement) bean).setDescriptionb((String) newValue);
                    return;
                case -602415628:  // comments
                    ((BankStatement) bean).setComments((String) newValue);
                    return;
                case -1413853096:  // amount
                    ((BankStatement) bean).setAmount((BigDecimal) newValue);
                    return;
                case -1225736746:  // amountOrder
                    ((BankStatement) bean).setAmountOrder((BigDecimal) newValue);
                    return;
                case -1425349507:  // amountDiff
                    ((BankStatement) bean).setAmountDiff((BigDecimal) newValue);
                    return;
                case 575402001:  // currency
                    ((BankStatement) bean).setCurrency((String) newValue);
                    return;
                case -892481550:  // status
                    ((BankStatement) bean).setStatus((String) newValue);
                    return;
                case 296922109:  // matching
                    ((BankStatement) bean).setMatching((BigDecimal) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
