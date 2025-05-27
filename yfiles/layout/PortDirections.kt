// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.YFlags

/**
 * @see [PortCandidate.createCandidate]
 * @see [PortCandidate.direction]
 * @see [PortCandidate.getDirectionForLayoutOrientation]
 * @see [PortCandidate.isInDirection]
 * @see [IPortCandidateMatcher.findMatchingCandidate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections">Online Documentation</a>
 */
external class PortDirections 
    private constructor(): YFlags<PortDirections> {
    companion object {
    /**
 * A port direction specifier indicating a port on the north (i.e., top) side of a node.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23NORTH">Online Documentation</a>
 */
val NORTH: PortDirections
/**
 * A port direction specifier indicating a port on the south (i.e., bottom) side of a node.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23SOUTH">Online Documentation</a>
 */
val SOUTH: PortDirections
/**
 * A port direction specifier indicating a port on the east (i.e., right) side of a node.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23EAST">Online Documentation</a>
 */
val EAST: PortDirections
/**
 * A port direction specifier indicating a port on the west (i.e., left) side of a node.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23WEST">Online Documentation</a>
 */
val WEST: PortDirections
/**
 * A port direction specifier indicating a port lying in the direction of the main flow of the edge or of the overall layout.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23WITH_THE_FLOW">Online Documentation</a>
 */
val WITH_THE_FLOW: PortDirections
/**
 * A port direction specifier indicating a port lying in the opposite direction of the main flow of the edge or of the overall layout.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23AGAINST_THE_FLOW">Online Documentation</a>
 */
val AGAINST_THE_FLOW: PortDirections
/**
 * A port direction specifier indicating a port lying left of the direction of the main flow of the edge or of the overall layout.
 * 
 * Value - `64`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23LEFT_IN_FLOW">Online Documentation</a>
 */
val LEFT_IN_FLOW: PortDirections
/**
 * A port direction specifier indicating a port lying right of the direction of the main flow of the edge or of the overall layout.
 * 
 * Value - `128`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23RIGHT_IN_FLOW">Online Documentation</a>
 */
val RIGHT_IN_FLOW: PortDirections
/**
 * A combination of all possible direction specifiers indicating that edges can connect to any side of a node.
 * 
 * Value - `255`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDirections%23ANY">Online Documentation</a>
 */
val ANY: PortDirections

    }
}
