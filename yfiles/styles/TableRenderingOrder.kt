// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

/**
 * Enumeration that is used to specify the drawing order for rows and columns
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableRenderingOrder">Online Documentation</a>
 */

sealed external class TableRenderingOrder {
  /**
   * Draw columns, then rows
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableRenderingOrder%23COLUMNS_FIRST">Online Documentation</a>
   */
  object COLUMNS_FIRST: TableRenderingOrder
  
  /**
   * Draw rows, then columns
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableRenderingOrder%23ROWS_FIRST">Online Documentation</a>
   */
  object ROWS_FIRST: TableRenderingOrder
}
