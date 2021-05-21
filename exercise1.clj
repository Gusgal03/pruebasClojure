(ns exercise1)
(load-file "./invoice.edn")

(defn get-invoices [invoices]{:invoice-item/id          "ii1"
                              :invoice-item/sku         "SKU 1"
                              :taxable/taxes            [{:tax/id       "t1"
                                                          :tax/category :iva
                                                          :tax/rate     19}]
                              :retentionable/retentions [{:retentions/id       "r1"
                                                          :retentions/category :ret_fuente
                                                          :retentions/rate     1}]}
  {:invoice-item/id  "ii2"
   :invoice-item/sku "SKU 2"
   :taxable/taxes    [{:tax/id       "t2"
                       :tax/category :iva
                       :tax/rate     16}]}
  {:invoice-item/id  "ii3"
   :invoice-item/sku "SKU 3"
   :taxable/taxes    [{:tax/id       "t3"
                       :tax/category :iva
                       :tax/rate     19}]}
  {:invoice-item/id          "ii3"
   :invoice-item/sku         "SKU 3"
   :retentionable/retentions [{:retention/id       "r2"
                               :retention/category :ret_fuente
                               :retention/rate     1}]}
  {:invoice-item/id          "ii4"
   :invoice-item/sku         "SKU 4"
   :retentionable/retentions [{:retention/id       "r3"
                               :retention/category :ret_fuente
                               :retention/rate     2}]}
(get-invoices "ii3")