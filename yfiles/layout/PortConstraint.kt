// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Edge
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [PortConstraint] represents a constraint for the source or target port of an edge path.
 * @see [PortConstraintKeys]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint">Online Documentation</a>
 */
external open class PortConstraint  : YObject {

/**
 * Gets whether or not this [PortConstraint] instance is associated with side [PortSide.ANY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23atAnySide">Online Documentation</a>
 */
open val atAnySide: Boolean
/**
 * Gets whether or not this [PortConstraint] instance is associated with side [PortSide.EAST].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23atEast">Online Documentation</a>
 */
open val atEast: Boolean
/**
 * Gets whether or not this [PortConstraint] instance is associated with side [PortSide.NORTH].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23atNorth">Online Documentation</a>
 */
open val atNorth: Boolean
/**
 * Gets whether or not this [PortConstraint] instance is associated with side [PortSide.SOUTH].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23atSouth">Online Documentation</a>
 */
open val atSouth: Boolean
/**
 * Gets whether or not this [PortConstraint] instance is associated with side [PortSide.WEST].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23atWest">Online Documentation</a>
 */
open val atWest: Boolean
/**
 * Gets the side of the node to which an edge should connect.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23side">Online Documentation</a>
 */
open val side: PortSide
/**
 * Gets whether or not this [PortConstraint] instance represents a strong constraint.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23strong">Online Documentation</a>
 */
open val strong: Boolean

companion object : ClassMetadata<PortConstraint> {
/**
 * Creates a new [PortConstraint] that constrains the edge to connect to the given side of a node and that can be either strong or weak.
 * @param [side] one of the default side specifiers
 * @param [strong] `true` if this [PortConstraint] is strong, `false` otherwise
 * @return a new [PortConstraint] instance
 * @throws ArgumentError if an unknown side is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23PortConstraint-method-create">Online Documentation</a>
 */
@JsName("create")
 final  operator fun invoke( side: PortSide ,
 strong: Boolean  = definedExternally):PortConstraint
/**
 * Returns the source [PortConstraint] associated with the given edge.
 * @receiver the input graph
 * @param [e] the edge
 * @return the source [PortConstraint] of the given edge or `null` if there is none
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23PortConstraint-method-getSPC">Online Documentation</a>
 */
 final   fun LayoutGraph.getSPC( e: Edge ):PortConstraint?
/**
 * Returns the target [PortConstraint] associated with the given edge.
 * @receiver the input graph
 * @param [e] the edge
 * @return the target [PortConstraint] of the given edge or `null` if there is none
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23PortConstraint-method-getTPC">Online Documentation</a>
 */
 final   fun LayoutGraph.getTPC( e: Edge ):PortConstraint?
/**
 * Checks whether or not there exist source or target [PortConstraint]s associated with the given edge.
 * @receiver the input graph
 * @param [e] the edge
 * @return `true` if the edge has source or target [PortConstraint]s, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23PortConstraint-method-hasPC">Online Documentation</a>
 */
 final   fun LayoutGraph.hasPC( e: Edge ):Boolean
/**
 * Checks whether or not there exist source [PortConstraint]s associated with the given edge.
 * @receiver the input graph
 * @param [e] the edge
 * @return `true` if the edge has source [PortConstraint]s, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23PortConstraint-method-hasSPC">Online Documentation</a>
 */
 final   fun LayoutGraph.hasSPC( e: Edge ):Boolean
/**
 * Checks whether or not there exist target [PortConstraint]s associated with the given edge.
 * @receiver the input graph
 * @param [e] the edge
 * @return `true` if the edge has target [PortConstraint]s, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraint%23PortConstraint-method-hasTPC">Online Documentation</a>
 */
 final   fun LayoutGraph.hasTPC( e: Edge ):Boolean
}
}
