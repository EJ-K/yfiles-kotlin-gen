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
import yfiles.layout.PortCandidate
import yfiles.layout.PortConstraint

/**
 * This class is a type-safe enumeration used for defining the border of a [PartitionCell].
 * @see [PartitionCell.createBorderInterval]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder">Online Documentation</a>
 */
external open class PartitionCellBorder  : YObject {

/**
 * Gets the type of the border that is on the opposite side of the border defined by this type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23mirrorBorder">Online Documentation</a>
 */
open val mirrorBorder: PartitionCellBorder

companion object : ClassMetadata<PartitionCellBorder> {
/**
 * A type constant that defines the right border of a [PartitionCell].
 * @see [PartitionCell.createBorderInterval]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23EAST">Online Documentation</a>
 */
 val EAST: PartitionCellBorder
/**
 * A type constant that defines the upper border of a [PartitionCell].
 * @see [PartitionCell.createBorderInterval]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23NORTH">Online Documentation</a>
 */
 val NORTH: PartitionCellBorder
/**
 * A type constant that defines the bottom border of a [PartitionCell].
 * @see [PartitionCell.createBorderInterval]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23SOUTH">Online Documentation</a>
 */
 val SOUTH: PartitionCellBorder
/**
 * A type constant that defines the left border of a [PartitionCell].
 * @see [PartitionCell.createBorderInterval]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23WEST">Online Documentation</a>
 */
 val WEST: PartitionCellBorder
/**
 * Returns the type of the border that is passed through when entering a [PartitionCell] in the given direction.
 * @param [direction] the direction in which a [PartitionCell] has been entered
 * @return the type of the border that is passed through when entering a [PartitionCell]
 * @see [PartitionCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23PartitionCellBorder-method-valueOfEnterDirection">Online Documentation</a>
 */
 final   fun valueOfEnterDirection( direction: Direction ):PartitionCellBorder
/**
 * Returns the type of the border that is passed through when exiting a [PartitionCell] in the given direction.
 * @param [direction] the direction in which a [PartitionCell] has been exited
 * @return the type of the border that is passed through when exiting a [PartitionCell]
 * @see [PartitionCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23PartitionCellBorder-method-valueOfExitDirection">Online Documentation</a>
 */
 final   fun valueOfExitDirection( direction: Direction ):PartitionCellBorder
/**
 * Returns the type of the border that is defined by the given [PortCandidate].
 * @param [pc] the port candidate for which the border type is returned
 * @return the type of the border that is defined by the given port candidate
 * @see [PortCandidate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23PartitionCellBorder-method-valueOfPortCandidate">Online Documentation</a>
 */
 final   fun valueOfPortCandidate( pc: PortCandidate ):PartitionCellBorder
/**
 * Returns the type of the border that is defined by the given [PortConstraint].
 * @param [pc] the port constraint for which the border type is returned
 * @return the type of the border that is defined by the given port constraint
 * @see [PortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellBorder%23PartitionCellBorder-method-valueOfPortConstraint">Online Documentation</a>
 */
 final   fun valueOfPortConstraint( pc: PortConstraint ):PartitionCellBorder
}
}
