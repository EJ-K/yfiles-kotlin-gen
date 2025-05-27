// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Facilitates decorating [IModelItem]s from an [IGraph] instance.
 * @see [nodeDecorator]
 * @see [NodeDecorator]
 * @see [edgeDecorator]
 * @see [EdgeDecorator]
 * @see [labelDecorator]
 * @see [LabelDecorator]
 * @see [portDecorator]
 * @see [PortDecorator]
 * @see [bendDecorator]
 * @see [BendDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GraphDecorator] class.
 * @param [graph] The graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23GraphDecorator-constructor-GraphDecorator">Online Documentation</a>
 */
external  class GraphDecorator  ( graph: IGraph ) : YObject {

/**
 * Gets a [bendDecorator] instance that can be used to decorate the [IBend] instances in the graph that this decorator has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23bendDecorator">Online Documentation</a>
 */
final val bendDecorator: BendDecorator
/**
 * Gets an [edgeDecorator] instance that can be used to decorate the [IEdge] instances in the graph that this decorator has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23edgeDecorator">Online Documentation</a>
 */
final val edgeDecorator: EdgeDecorator
/**
 * Gets a [labelDecorator] instance that can be used to decorate the [ILabel] instances in the graph that this decorator has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23labelDecorator">Online Documentation</a>
 */
final val labelDecorator: LabelDecorator
/**
 * Gets a [nodeDecorator] instance that can be used to decorate the [INode] instances in the graph that this decorator has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23nodeDecorator">Online Documentation</a>
 */
final val nodeDecorator: NodeDecorator
/**
 * Gets a [portDecorator] instance that can be used to decorate the [IPort] instances in the graph that this decorator has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDecorator%23portDecorator">Online Documentation</a>
 */
final val portDecorator: PortDecorator

companion object : ClassMetadata<GraphDecorator> {
}
}

inline operator fun  GraphDecorator.invoke(
    block: GraphDecorator.() -> Unit
): GraphDecorator = apply(block)
