// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Graph
import yfiles.algorithms.GraphDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class represents a partition grid that partitions the drawing area into rectangular partition cells.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid">Online Documentation</a>
 * 
 * @constructor Creates an instance of [PartitionGrid] with the given number of rows and columns as well as with given insets and minimum sizes.
 * @param [rowCount] the number of rows
 * @param [columnCount] the number of columns
 * @param [rowInsets] the top and bottom insets of the rows
 * @param [columnInsets] the left and right insets of the columns
 * @param [minRowSize] the minimum row height
 * @param [minColumnSize] the minimum column width
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-constructor-PartitionGrid">Online Documentation</a>
 */
external open class PartitionGrid  ( rowCount: Int  = definedExternally,
 columnCount: Int  = definedExternally,
 rowInsets: Double  = definedExternally,
 columnInsets: Double  = definedExternally,
 minRowSize: Double  = definedExternally,
 minColumnSize: Double  = definedExternally) : YObject {

/**
 * Gets the columns of the [partition grid][PartitionGrid].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23columns">Online Documentation</a>
 */
final val columns: IEnumerable<ColumnDescriptor>
/**
 * Gets or sets whether or not the order of the columns should be chosen automatically to minimize edge lengths.
 * 
 * Default value - `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23optimizeColumnOrder">Online Documentation</a>
 */
open var optimizeColumnOrder: Boolean
/**
 * Gets or sets whether or not the order of the rows should be chosen automatically to minimize edge lengths.
 * 
 * Default value - `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23optimizeRowOrder">Online Documentation</a>
 */
open var optimizeRowOrder: Boolean
/**
 * Gets the rows of the [partition grid][PartitionGrid].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23rows">Online Documentation</a>
 */
final val rows: IEnumerable<RowDescriptor>
/**
 * Adds a new [column][ColumnDescriptor] to the [PartitionGrid] instance.
 * @return a new [ColumnDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-addColumn">Online Documentation</a>
 */
 open   fun addColumn():ColumnDescriptor
/**
 * Adds a new [row][RowDescriptor] to the [PartitionGrid] instance.
 * @return a new [RowDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-addRow">Online Documentation</a>
 */
 open   fun addRow():RowDescriptor
/**
 * Creates a [partition cell][PartitionCellId] identifier that represents the cell defined by the given [column][ColumnDescriptor] and [row][RowDescriptor].
 * @param [rd] the row defining the cell
 * @param [cd] the column defining the cell
 * @return a [PartitionCellId] instance
 * @throws ArgumentError if the given column/row is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-createCellId(RowDescriptor,ColumnDescriptor)">Online Documentation</a>
 */
 open   fun createCellId( rd: RowDescriptor ,
 cd: ColumnDescriptor ):PartitionCellId
/**
 * Creates a [partition cell][PartitionCellId] identifier that represents the cell defined by the given column and row index.
 * @param [rowIndex] the row index of the row defining the cell
 * @param [columnIndex] the column index of the column defining the cell
 * @return a [PartitionCellId] instance
 * @throws ArgumentError if the given column/row index is not valid
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-createCellId(number,number)">Online Documentation</a>
 */
 open   fun createCellId( rowIndex: Int ,
 columnIndex: Int ):PartitionCellId
/**
 * Creates a [partition cell][PartitionCellId] identifier that represents a multi-cell spanning multiple columns and rows.
 * @param [rowList] the [rows][RowDescriptor] defining the cell
 * @param [columnList] the [columns][ColumnDescriptor] defining the cell
 * @return a [PartitionCellId] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-createCellSpanId(ICollection,ICollection)">Online Documentation</a>
 */
 open   fun createCellSpanId( rowList: ICollection<out RowDescriptor> ,
 columnList: ICollection<out ColumnDescriptor> ):PartitionCellId
/**
 * Creates a [partition cell][PartitionCellId] identifier that represents a multi-cell spanning multiple columns and rows.
 * @param [fromRowIndex] the row index of the topmost row defining the cell
 * @param [fromColIndex] the column index of the leftmost column defining the cell
 * @param [toRowIndex] the row index of the bottommost row defining the cell
 * @param [toColIndex] the column index of the rightmost column defining the cell
 * @return a [PartitionCellId] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-createCellSpanId(number,number,number,number)">Online Documentation</a>
 */
 open   fun createCellSpanId( fromRowIndex: Int ,
 fromColIndex: Int ,
 toRowIndex: Int ,
 toColIndex: Int ):PartitionCellId
/**
 * Creates a [partition cell][PartitionCellId] identifier that represents a multi-cell spanning multiple columns and rows.
 * @param [fromRow] the topmost row defining the cell
 * @param [fromCol] the leftmost column defining the cell
 * @param [toRow] the bottommost row defining the cell
 * @param [toCol] the rightmost column defining the cell
 * @return a [PartitionCellId] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-createCellSpanId(RowDescriptor,ColumnDescriptor,RowDescriptor,ColumnDescriptor)">Online Documentation</a>
 */
 open   fun createCellSpanId( fromRow: RowDescriptor ,
 fromCol: ColumnDescriptor ,
 toRow: RowDescriptor ,
 toCol: ColumnDescriptor ):PartitionCellId
/**
 * Creates a [partition cell][PartitionCellId] identifier that represents a cell spanning a whole column.
 * @param [columnIndex] the column index of the column defining the cell
 * @return a [PartitionCellId] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-createColumnSpanId">Online Documentation</a>
 */
 open   fun createColumnSpanId( columnIndex: Int ):PartitionCellId
/**
 * Creates a [partition cell][PartitionCellId] identifier that represents a cell spanning a whole row.
 * @param [rowIndex] the row index of the row defining the cell
 * @return a [PartitionCellId] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-createRowSpanId">Online Documentation</a>
 */
 open   fun createRowSpanId( rowIndex: Int ):PartitionCellId
/**
 * Finalizes the orientation changes and is called at the end of the [OrientationLayout] stage.
 * @param [orientationLayouter] an [OrientationLayout] instance
 * @see [OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-finalizeOrientationChange">Online Documentation</a>
 */
 open   fun finalizeOrientationChange( orientationLayouter: OrientationLayout )
/**
 * Returns the [column][ColumnDescriptor] with the given index.
 * @param [index] the index of the column to be returned
 * @return the [column][ColumnDescriptor] with the given index or `null` if no such column exists
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-getColumn">Online Documentation</a>
 */
 open   fun getColumn( index: Int ):ColumnDescriptor?
/**
 * Returns the [row][RowDescriptor] with the given index.
 * @param [index] the index of the row to be returned
 * @return the [row][RowDescriptor] with the given index or `null` if no such row exists
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-getRow">Online Documentation</a>
 */
 open   fun getRow( index: Int ):RowDescriptor?
/**
 * Prepares for the orientation changes and is called at the beginning of the [OrientationLayout] stage.
 * @param [orientationLayouter] an [OrientationLayout] instance
 * @see [OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-prepareOrientationChange">Online Documentation</a>
 */
 open   fun prepareOrientationChange( orientationLayouter: OrientationLayout )

companion object : ClassMetadata<PartitionGrid> {
/**
 * A data provider key for storing a set of partition cells for each node.
 * @see [PartitionCellId]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PARTITION_CELL_ID_DP_KEY">Online Documentation</a>
 */
 val PARTITION_CELL_ID_DP_KEY: NodeDpKey<PartitionCellId>
/**
 * A data provider key for storing the partition grid structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PARTITION_GRID_DP_KEY">Online Documentation</a>
 */
 val PARTITION_GRID_DP_KEY: GraphDpKey<PartitionGrid>
/**
 * Returns the [PartitionGrid] instance associated with the given graph.
 * @receiver the given graph
 * @return the [PartitionGrid] of the graph or `null` if the graph has no associated partition grid
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGrid%23PartitionGrid-method-getPartitionGrid">Online Documentation</a>
 */
 final   fun Graph.getPartitionGrid():PartitionGrid?
}
}

inline fun PartitionGrid(
    block: PartitionGrid.() -> Unit
): PartitionGrid {
    return PartitionGrid()
        .apply(block)
}
