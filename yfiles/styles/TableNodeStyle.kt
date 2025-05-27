// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.ITable
import yfiles.lang.ClassMetadata

/**
 * An [INodeStyle] for [tables][ITable].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle">Online Documentation</a>
 * 
 * @constructor Constructor with a custom renderer implementation that uses `table` as backing table model.
 * @param [table] The table instance that defines the tabular structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23TableNodeStyle-constructor-TableNodeStyle">Online Documentation</a>
 * 
 * @property table
 * Gets or sets the [ITable] instance that defines the tabular structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23table">Online Documentation</a>
 */
external class TableNodeStyle (
final var table: ITable = definedExternally) : INodeStyle {
  /**
   * Gets or sets the style that is used to draw the background of the table.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23backgroundStyle">Online Documentation</a>
   */
  final var backgroundStyle: INodeStyle?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * Gets or sets the order in which rows and columns are rendered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23tableRenderingOrder">Online Documentation</a>
   */
  final var tableRenderingOrder: TableRenderingOrder
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23TableNodeStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): TableNodeStyle
  
  companion object : ClassMetadata<TableNodeStyle> {
  }
}

inline fun TableNodeStyle(
    block: TableNodeStyle.() -> Unit
): TableNodeStyle {
    return TableNodeStyle()
        .apply(block)
}
