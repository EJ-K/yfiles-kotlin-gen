// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IList
import yfiles.lang.ClassMetadata

/**
 * A [PathSearchResult] represents the result of a path search as a list of consecutive [CellEntrance]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PathSearchResult] for the given edge, [CellEntrance]s, and cost.
 * @param [entrances] the list of [CellEntrance] objects describing the edge path from source node to target node
 * @param [cost] the overall cost of this path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23PathSearchResult-constructor-PathSearchResult">Online Documentation</a>
 * 
 * @property cost
 * Gets the overall cost of this path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23cost">Online Documentation</a>
 */
external class PathSearchResult (
entrances: IList<out CellEntrance>,
final val cost: Double)  {
  /**
   * Returns the number of [CellEntrance] objects in this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23cellEntranceCount">Online Documentation</a>
   */
  final val cellEntranceCount: Int
  
  /**
   * Returns the [CellEntrance] at the given position of this path.
   * @param [position] the position of the [CellEntrance] to return
   * @return the [CellEntrance] at the given position of this path
   * @see [setEntrance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23PathSearchResult-method-getEntrance">Online Documentation</a>
   */
  fun getEntrance(
    position: Int,
  ): CellEntrance
  
  /**
   * Returns the position of the first occurrence of the given [CellEntrance] in this path, or `-1` if this path does not contain this [CellEntrance].
   * @param [entrance] the [CellEntrance] for which the position is retrieved
   * @return the position of the first occurrence of the given [CellEntrance] in this path, or `-1` if this path does not contain this [CellEntrance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23PathSearchResult-method-positionOf">Online Documentation</a>
   */
  fun positionOf(
    entrance: CellEntrance,
  ): Int
  
  /**
   * Replaces the [CellEntrance] at the given position of this path with the given [CellEntrance].
   * @param [position] the position of the [CellEntrance] to replace
   * @param [entrance] the [CellEntrance] to be stored at the given position
   * @see [getEntrance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23PathSearchResult-method-setEntrance">Online Documentation</a>
   */
  fun setEntrance(
    position: Int,
    entrance: CellEntrance,
  )
  
  companion object : ClassMetadata<PathSearchResult> {
  }
}
