// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.Direction

/**
 * This class describes the location and the direction from which a given [partition cell][PartitionCell] has been entered during a path search.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance">Online Documentation</a>
 * 
 * @constructor Creates a new [CellEntrance] instance for a given [PartitionCell].
 * @param [cell] the [PartitionCell] that is entered
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23CellEntrance-constructor-CellEntrance(PartitionCell)">Online Documentation</a>
 * 
 * @property cell
 * Gets the [partition cell][PartitionCell] of this [CellEntrance] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23cell">Online Documentation</a>
 */
external open class CellEntrance  (
open val cell: PartitionCell) : YObject {
/**
 * Creates a new [CellEntrance] instance that is a copy of a given other [CellEntrance].
 * @param [other] the [CellEntrance] to be copied
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23CellEntrance-constructor-CellEntrance(CellEntrance)">Online Documentation</a>
 */
 constructor( other: CellEntrance )

/**
 * Gets or sets the costs for the implicit path given by the [previous entrances][previousEntrance].
 * 
 * Default value - `0`
 * @throws ArgumentError if the costs are negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23costs">Online Documentation</a>
 */
open var costs: Double
/**
 * Gets or sets the direction from which this [cell] was entered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23enterDirection">Online Documentation</a>
 */
open var enterDirection: Direction
/**
 * Gets or sets the [OrthogonalInterval] that was used for entering this [cell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23enterInterval">Online Documentation</a>
 */
open var enterInterval: OrthogonalInterval
/**
 * Gets or sets the heuristic costs for the implicit path given by the [previous entrances][previousEntrance].
 * 
 * Default value - `0`
 * @throws ArgumentError if the heuristic costs are negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23heuristicCosts">Online Documentation</a>
 */
open var heuristicCosts: Double
/**
 * Gets or sets the [EdgeCellInfo] describing how the previous [partition cell][PartitionCell] was traversed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23previousEdgeCellInfo">Online Documentation</a>
 */
open var previousEdgeCellInfo: EdgeCellInfo
/**
 * Gets or sets the previous [CellEntrance] along the path that was traversed in order to reach the [cell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellEntrance%23previousEntrance">Online Documentation</a>
 */
open var previousEntrance: CellEntrance

companion object : ClassMetadata<CellEntrance> {
}
}
