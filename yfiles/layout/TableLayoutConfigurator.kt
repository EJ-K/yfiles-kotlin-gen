// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.array.ReadonlyArray
import yfiles.geometry.Rect
import yfiles.graph.IColumn
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.graph.IRow
import yfiles.graph.ITable
import yfiles.lang.ClassMetadata

/**
 * Creates a [LayoutGrid] that matches a given table configuration of an [IGraph] and returns a [LayoutGridData] for that grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-constructor-TableLayoutConfigurator">Online Documentation</a>
 */
open external class TableLayoutConfigurator ()  {
  /**
   * Gets or sets whether size compaction for table nodes is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23compaction">Online Documentation</a>
   */
  final var compaction: Boolean
  
  /**
   * Gets or sets whether 'from sketch' mode is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23fromSketch">Online Documentation</a>
   */
  final var fromSketch: Boolean
  
  /**
   * Gets the [LayoutGrid] created in the [prepare][TableLayoutConfigurator] method.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23grid">Online Documentation</a>
   */
  final val grid: LayoutGrid?
  
  /**
   * Gets or sets whether the configurator will prepare its associated graph for a vertical (that is top-to-bottom or bottom-to-top) layout calculation or a horizontal (that is left-to-right or right-to-left) one.
   * 
   * The default value for this property is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23horizontalLayout">Online Documentation</a>
   */
  final var horizontalLayout: Boolean
  
  /**
   * Gets or sets the minimum distance between two different table nodes.
   * 
   * The default value is `50`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23minimumTableDistance">Online Documentation</a>
   */
  final var minimumTableDistance: Double
  
  /**
   * Destroy all information that results from a previous [prepare][TableLayoutConfigurator] and a subsequent layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-cleanUp">Online Documentation</a>
   */
  open fun cleanUp(
    graph: IGraph,
  )
  
  /**
   * Returns the [LayoutGridCellDescriptor] assigned to the `node`.
   * @param [node] The node to return the assigned cell for.
   * @return The [LayoutGridCellDescriptor] assigned to the `node`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getAssignedCells">Online Documentation</a>
   */
  fun getAssignedCells(
    node: INode,
  ): LayoutGridCellDescriptor?
  
  /**
   * Returns the [ITable] the `node` belongs to.
   * @param [node] The node to lookup the table for.
   * @return The [ITable] the `node` is associated with or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getAssociatedTable">Online Documentation</a>
   */
  fun getAssociatedTable(
    node: INode,
  ): ITable?
  
  /**
   * Returns the [LayoutGridColumn] in the [grid][TableLayoutConfigurator] to which the `leafColumn` is mapped.
   * @param [leafColumn] The column to return the column descriptor for.
   * @return The [LayoutGridColumn] the `leafColumn` is mapped to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getColumnDescriptor">Online Documentation</a>
   */
  fun getColumnDescriptor(
    leafColumn: IColumn,
  ): LayoutGridColumn?
  
  /**
   * Return the sizes of all **leaf** rows.
   * @param [originalTable] The table
   * @param [nodeLayout] The final layout of the node that owns the table
   * @return The sizes of all **leaf** rows in `originalTable`, in their natural order.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getColumnLayout">Online Documentation</a>
   */
  open fun getColumnLayout(
    originalTable: ITable,
    nodeLayout: Rect,
  ): ReadonlyArray<Double>
  
  /**
   * Returns the [LayoutGridRow] of the row in the [grid][TableLayoutConfigurator] to which the `leafRow` is mapped.
   * @param [leafRow] The row to return the row descriptor for.
   * @return The [LayoutGridRow] the `leafRow` is mapped to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getRowDescriptor">Online Documentation</a>
   */
  fun getRowDescriptor(
    leafRow: IRow,
  ): LayoutGridRow?
  
  /**
   * Return the sizes of all **leaf** rows.
   * @param [originalTable] The table
   * @param [nodeLayout] The final layout of the node that owns the table
   * @return The sizes of all **leaf** rows in `originalTable`, in their natural order.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getRowLayout">Online Documentation</a>
   */
  open fun getRowLayout(
    originalTable: ITable,
    nodeLayout: Rect,
  ): ReadonlyArray<Double>
  
  /**
   * Returns the [INode] which provides the `table` in its [lookup][yfiles.collections.ILookup].
   * @param [table] The table for which the corresponding owner node is searched.
   * @return The [INode] which provides the `table` in its [lookup][yfiles.collections.ILookup].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getTableNode">Online Documentation</a>
   */
  fun getTableNode(
    table: ITable,
  ): INode?
  
  /**
   * Returns whether `node` is recognized as a table node by this instance.
   * @param [node] The node to check.
   * @return `true` if this instance treats `node` as a table node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-isTableNode">Online Documentation</a>
   */
  fun isTableNode(
    node: INode,
  ): Boolean
  
  /**
   * Setup layout grid information from a graph that contains table structures
   * @param [graph] The graph to prepare a [LayoutGridData] for.
   * @return A [LayoutGridData] instance for all tables in the graph, or `null` if no [LayoutGrid] is necessary.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-prepare">Online Documentation</a>
   */
  open fun prepare(
    graph: IGraph,
  ): LayoutGridData<INode, IEdge, ILabel, ILabel>?
  
  /**
   * Write back all information from the layout grid
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-restore">Online Documentation</a>
   */
  open fun restore(
    graph: IGraph,
  )
  
  companion object : ClassMetadata<TableLayoutConfigurator> {
  }
}

inline fun TableLayoutConfigurator(
    block: TableLayoutConfigurator.() -> Unit
): TableLayoutConfigurator {
    return TableLayoutConfigurator()
        .apply(block)
}
