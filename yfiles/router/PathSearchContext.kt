// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IListEnumerable
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutEdge

/**
 * This class provides context information that is useful for the path search algorithm of [EdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext">Online Documentation</a>
 */
external class PathSearchContext private constructor()  {
  /**
   * Gets an artificial [PartitionCell] with the size of the bounds of all source cells of the [current path request][PathSearchContext].
   * @see [getSourceCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23combinedSourceCell">Online Documentation</a>
   */
  final val combinedSourceCell: PartitionCell
  
  /**
   * Gets an artificial [PartitionCell] with the size of the bounds of all target cells of the [current path request][PathSearchContext].
   * @see [getTargetCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23combinedTargetCell">Online Documentation</a>
   */
  final val combinedTargetCell: PartitionCell
  
  /**
   * Gets the configuration used for the path search phase.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23configuration">Online Documentation</a>
   */
  final val configuration: PathSearchConfiguration
  
  /**
   * Gets or sets the edge that is currently routed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23currentEdge">Online Documentation</a>
   */
  final val currentEdge: LayoutEdge
  
  /**
   * Gets the [EdgeRouterEdgeDescriptor] for the [currentEdge][PathSearchContext] containing edge-specific settings for the path search.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23currentEdgeDescriptor">Online Documentation</a>
   */
  final val currentEdgeDescriptor: EdgeRouterEdgeDescriptor
  
  /**
   * Gets or sets the [PathSearchRequest] that is currently routed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23currentRequest">Online Documentation</a>
   */
  final val currentRequest: PathSearchRequest
  
  /**
   * Gets the [ICursor][yfiles.collections.ICursor] of [LayoutEdge] to iterate over the edges that are routed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23edges">Online Documentation</a>
   */
  final val edges: IListEnumerable<LayoutEdge>
  
  /**
   * Adds an additional source cell of the [current path request][PathSearchContext] if it is not already contained in the list of source cells.
   * @param [cell] the new source cell to add
   * @see [sourceCellCount]
   * @see [getSourceCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-addSourceCell">Online Documentation</a>
   */
  fun addSourceCell(
    cell: PartitionCell,
  )
  
  /**
   * Adds an additional target cell of the [current path request][PathSearchContext] if it is not already contained in the list of target cells.
   * @param [cell] the new target cell to add
   * @see [targetCellCount]
   * @see [getTargetCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-addTargetCell">Online Documentation</a>
   */
  fun addTargetCell(
    cell: PartitionCell,
  )
  
  /**
   * Returns the source cell with the given index in the list of all cells that are covered by the source of the [current path request][PathSearchContext].
   * @param [index] the index of the source cell
   * @return the source cell with the given index in the list of all source cells
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-getSourceCell">Online Documentation</a>
   */
  fun getSourceCell(
    index: Int,
  ): PartitionCell
  
  /**
   * Returns the target cell with the given index in the list of all cells that are covered by the target of the [current path request][PathSearchContext].
   * @param [index] The index of the target cell
   * @return The target cell with the given index in the list of all cells that are covered by the target of the [current path request][PathSearchContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-getTargetCell">Online Documentation</a>
   */
  fun getTargetCell(
    index: Int,
  ): PartitionCell
  
  /**
   * Determines whether or not the given cell is a source cell of the [current path request][PathSearchContext].
   * @param [cell] the cell
   * @return `true` if the given cell is in the list of source cells, `false` otherwise
   * @see [sourceCellCount]
   * @see [getSourceCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-isSourceCell">Online Documentation</a>
   */
  fun isSourceCell(
    cell: PartitionCell,
  ): Boolean
  
  /**
   * Determines whether or not the given cell is a target cell of the [current path request][PathSearchContext].
   * @param [cell] the cell
   * @return `true` if the given cell is in the list of target cells, `false` otherwise
   * @see [targetCellCount]
   * @see [getTargetCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-isTargetCell">Online Documentation</a>
   */
  fun isTargetCell(
    cell: PartitionCell,
  ): Boolean
  
  /**
   * Returns the number of all cells that are covered by the source of the [current path request][PathSearchContext].
   * @return the number of all cells that are covered by the source
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-sourceCellCount">Online Documentation</a>
   */
  fun sourceCellCount(): Int
  
  /**
   * Returns the number of all cells that are covered by the target of the [current path request][PathSearchContext].
   * @return the number of all cells that are covered by the target
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchContext%23PathSearchContext-method-targetCellCount">Online Documentation</a>
   */
  fun targetCellCount(): Int
  
  companion object : ClassMetadata<PathSearchContext> {
  }
}
