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
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.graph.IRow
import yfiles.graph.ITable
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Creates a [PartitionGrid] that matches a given table configuration of an [IGraph] and registers [IMapper][yfiles.collections.IMapper] for that grid at the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-constructor-TableLayoutConfigurator">Online Documentation</a>
 */
external open class TableLayoutConfigurator  () : YObject {

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
 * Gets the [PartitionGrid] created in the [prepare] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23grid">Online Documentation</a>
 */
final val grid: PartitionGrid?
/**
 * Gets or sets whether the configurator will prepare its associated graph for a vertical (that is top-to-bottom or bottom-to-top) layout calculation or a horizontal (that is left-to-right or right-to-left) one.
 * 
 * The default value for this property is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23horizontalLayout">Online Documentation</a>
 */
final var horizontalLayout: Boolean
/**
 * Gets or sets the minimum distance between two different table nodes
 * 
 * The default value is `50`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23minimumTableDistance">Online Documentation</a>
 */
final var minimumTableDistance: Double
/**
 * Destroy all information that results from a previous [prepare] and a subsequent layout
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-cleanUp">Online Documentation</a>
 */
 open   fun cleanUp( graph: IGraph )
/**
 * Returns the [PartitionCellId] assigned to the `node`.
 * @param [node] The node to return the assigned cell id for.
 * @return The [PartitionCellId] assigned to the `node`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getAssignedCellId">Online Documentation</a>
 */
 final   fun getAssignedCellId( node: INode ):PartitionCellId?
/**
 * Returns the [ITable] the `node` belongs to.
 * @param [node] The node to lookup the table for.
 * @return The [ITable] the `node` is associated with or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getAssociatedTable">Online Documentation</a>
 */
 final   fun getAssociatedTable( node: INode ):ITable?
/**
 * Returns the [ColumnDescriptor] of the column in the [grid] to which the `leafColumn` is mapped.
 * @param [leafColumn] The column to return the column descriptor for.
 * @return The [ColumnDescriptor] the `leafColumn` is mapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getColumnDescriptor">Online Documentation</a>
 */
 final   fun getColumnDescriptor( leafColumn: IColumn ):ColumnDescriptor?
/**
 * Return the sizes of all **leaf** rows.
 * @param [originalTable] The table
 * @param [nodeLayout] The final layout of the node that owns the table
 * @return The sizes of all **leaf** rows in `originalTable`, in their natural order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getColumnLayout">Online Documentation</a>
 */
 open   fun getColumnLayout( originalTable: ITable ,
 nodeLayout: Rect ):ReadonlyArray<Double>
/**
 * Returns the [RowDescriptor] of the row in the [grid] to which the `leafRow` is mapped.
 * @param [leafRow] The row to return the row descriptor for.
 * @return The [RowDescriptor] the `leafRow` is mapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getRowDescriptor">Online Documentation</a>
 */
 final   fun getRowDescriptor( leafRow: IRow ):RowDescriptor?
/**
 * Return the sizes of all **leaf** rows.
 * @param [originalTable] The table
 * @param [nodeLayout] The final layout of the node that owns the table
 * @return The sizes of all **leaf** rows in `originalTable`, in their natural order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getRowLayout">Online Documentation</a>
 */
 open   fun getRowLayout( originalTable: ITable ,
 nodeLayout: Rect ):ReadonlyArray<Double>
/**
 * Returns the [INode] which provides the `table` in its [lookup][yfiles.graph.ILookup.lookup].
 * @param [table] The table for which the corresponding owner node is searched.
 * @return The [INode] which provides the `table` in its [lookup][yfiles.graph.ILookup.lookup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-getTableNode">Online Documentation</a>
 */
 final   fun getTableNode( table: ITable ):INode?
/**
 * Returns whether `node` is recognized as a table node by this instance.
 * @param [node] The node to check.
 * @return `true` if this instance treats `node` as a table node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-isTableNode">Online Documentation</a>
 */
 final   fun isTableNode( node: INode ):Boolean
/**
 * Setup partition grid information from a graph that contains table structures
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-prepare">Online Documentation</a>
 */
 open   fun prepare( graph: IGraph )
/**
 * Write back all information from the partition grid
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableLayoutConfigurator%23TableLayoutConfigurator-method-restore">Online Documentation</a>
 */
 open   fun restore( graph: IGraph )

companion object : ClassMetadata<TableLayoutConfigurator> {
}
}

inline fun TableLayoutConfigurator(
    block: TableLayoutConfigurator.() -> Unit
): TableLayoutConfigurator {
    return TableLayoutConfigurator()
        .apply(block)
}
