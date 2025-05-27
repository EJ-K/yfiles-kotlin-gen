// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeList
import yfiles.algorithms.IEdgeCursor
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class provides context information that is useful for the [PathSearch] algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PathSearchContext].
 * @param [pathSearch] the path search that uses this context
 * @param [configuration] the configuration used for the path search
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-constructor-PathSearchContext">Online Documentation</a>
 * 
 * @property pathSearch
 * Gets the [PathSearch] that uses this context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23pathSearch">Online Documentation</a>
 * 
 * @property configuration
 * Gets the configuration used for the [PathSearch].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23configuration">Online Documentation</a>
 */
external open class PathSearchContext 
protected constructor (
open val pathSearch: PathSearch,
open val configuration: PathSearchConfiguration) : YObject {

/**
 * Gets an artificial [partition cell][PartitionCell] with the size of the bounding box of all source cells of the [current path request][currentRequest].
 * @see [getSourceCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23combinedSourceCell">Online Documentation</a>
 */
open val combinedSourceCell: PartitionCell
/**
 * Gets an artificial [partition cell][PartitionCell] with the size of the bounding box of all target cells of the [current path request][currentRequest].
 * @see [getTargetCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23combinedTargetCell">Online Documentation</a>
 */
open val combinedTargetCell: PartitionCell
/**
 * Gets or sets the edge that is currently routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23currentEdge">Online Documentation</a>
 */
open var currentEdge: Edge
/**
 * Gets the [EdgeLayoutDescriptor] for the [current edge][currentEdge] containing edge specific settings for the path search.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23currentEdgeLayoutDescriptor">Online Documentation</a>
 */
open val currentEdgeLayoutDescriptor: EdgeLayoutDescriptor
/**
 * Gets or sets the [PathRequest] that is currently routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23currentRequest">Online Documentation</a>
 */
open var currentRequest: PathRequest
/**
 * Gets the [IEdgeCursor] to iterate over the edges that are routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23edges">Online Documentation</a>
 */
open val edges: IEdgeCursor
/**
 * Gets the results of the [PathSearch].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23pathSearchResult">Online Documentation</a>
 */
open val pathSearchResult: PathSearchResult
/**
 * Adds an additional source cell of the [current path request][currentRequest] if it is not already contained in the list of source cells.
 * @param [cell] the new source cell to add
 * @see [sourceCellCount]
 * @see [getSourceCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-addSourceCell">Online Documentation</a>
 */
 open   fun addSourceCell( cell: PartitionCell )
/**
 * Adds an additional target cell of the [current path request][currentRequest] if it is not already contained in the list of target cells.
 * @param [cell] the new target cell to add
 * @see [targetCellCount]
 * @see [getTargetCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-addTargetCell">Online Documentation</a>
 */
 open   fun addTargetCell( cell: PartitionCell )
/**
 * Returns the source cell with the given index in the list of all cells that are covered by the source of the [current path request][currentRequest].
 * @param [index] the index of the source cell
 * @return the source cell with the given index in the list of all source cells
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-getSourceCell">Online Documentation</a>
 */
 open   fun getSourceCell( index: Int ):PartitionCell
/**
 * Returns the target cell with the given index in the list of all cells that are covered by the target of the [current path request][currentRequest].
 * @param [index] the index of the target cell
 * @return the target cell with the given index in the list of all cells that are covered by the target of the [current path request][currentRequest]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-getTargetCell">Online Documentation</a>
 */
 open   fun getTargetCell( index: Int ):PartitionCell
/**
 * Determines whether or not the given cell is a source cell of the [current path request][currentRequest].
 * @param [cell] the cell
 * @return `true` if the given cell is in the list of source cells, `false` otherwise
 * @see [sourceCellCount]
 * @see [getSourceCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-isSourceCell">Online Documentation</a>
 */
 open   fun isSourceCell( cell: PartitionCell ):Boolean
/**
 * Determines whether or not the given cell is a target cell of the [current path request][currentRequest].
 * @param [cell] the cell
 * @return `true` if the given cell is in the list of target cells, `false` otherwise
 * @see [targetCellCount]
 * @see [getTargetCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-isTargetCell">Online Documentation</a>
 */
 open   fun isTargetCell( cell: PartitionCell ):Boolean
/**
 * Specifies the edges that shall be routed.
 * @param [edges] the list of edges that shall be routed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-setEdges">Online Documentation</a>
 */
 open protected   fun setEdges( edges: EdgeList )
/**
 * Returns the number of all cells that are covered by the source of the [current path request][currentRequest].
 * @return the number of all cells that are covered by the source
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-sourceCellCount">Online Documentation</a>
 */
 open   fun sourceCellCount():Int
/**
 * Returns the number of all cells that are covered by the target of the [current path request][currentRequest].
 * @return the number of all cells that are covered by the target
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-targetCellCount">Online Documentation</a>
 */
 open   fun targetCellCount():Int

companion object : ClassMetadata<PathSearchContext> {
}
}
