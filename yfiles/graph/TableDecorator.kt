// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata

/**
 * Facilitates decorating [IModelItem]s from an [ITable] instance.
 * @see [rows]
 * @see [columns]
 * @see [StripeDecorator]
 * @see [stripeLabels]
 * @see [StripeLabelDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TableDecorator] class.
 * @param [table] The table.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableDecorator%23TableDecorator-constructor-TableDecorator">Online Documentation</a>
 */
external class TableDecorator (
  table: ITable,
)  {
  /**
   * Gets a [StripeDecorator] instance that can be used to decorate the [IColumn] instances in the table that this decorator has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableDecorator%23columns">Online Documentation</a>
   */
  final val columns: StripeDecorator<IColumn>
  
  /**
   * Gets a [StripeDecorator] instance that can be used to decorate the [IRow] instances in the table that this decorator has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableDecorator%23rows">Online Documentation</a>
   */
  final val rows: StripeDecorator<IRow>
  
  /**
   * Gets a [StripeLabelDecorator] instance that can be used to decorate the [ILabel] instances in the table that this decorator has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableDecorator%23stripeLabels">Online Documentation</a>
   */
  final val stripeLabels: StripeLabelDecorator
  
  companion object : ClassMetadata<TableDecorator> {
  }
}

inline operator fun  TableDecorator.invoke(
    block: TableDecorator.() -> Unit
): TableDecorator = apply(block)
