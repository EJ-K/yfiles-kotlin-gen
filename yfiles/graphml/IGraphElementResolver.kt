// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for classes can resolve graph elements based on their GraphML id attribute(s).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementResolver">Online Documentation</a>
 */
external interface IGraphElementResolver : YObject {
/**
 * Resolve the GraphML `id` to an [IEdge] instance.
 * @param [context] The current parse context.
 * @param [id] The id that should be resolved.
 * @return The [IEdge] that is defined by this GraphML `id`, or `null` if no such edge exists yet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementResolver%23IGraphElementResolver-method-resolveEdge">Online Documentation</a>
 */
   fun resolveEdge( context: IParseContext ,
 id: ElementId ):IEdge?
/**
 * Resolve the GraphML `id` to an [IGraph] instance.
 * @param [context] The current parse context.
 * @param [id] The id that should be resolved.
 * @return The [IGraph] that is defined by this GraphML `id`, or `null` if no such graph exists yet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementResolver%23IGraphElementResolver-method-resolveGraph">Online Documentation</a>
 */
   fun resolveGraph( context: IParseContext ,
 id: ElementId ):IGraph?
/**
 * Resolve the GraphML `id` to an [INode] instance.
 * @param [context] The current parse context.
 * @param [id] The id that should be resolved.
 * @return The [INode] that is defined by this GraphML `id`, or `null` if no such node exists yet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementResolver%23IGraphElementResolver-method-resolveNode">Online Documentation</a>
 */
   fun resolveNode( context: IParseContext ,
 id: ElementId ):INode?
/**
 * Resolve the GraphML `id` to an [IPort] instance.
 * @param [context] The current parse context.
 * @param [ownerId] The GraphML id of the port owner.
 * @param [id] The id that should be resolved.
 * @return The [IPort] that is defined by the GraphML ids, or `null` if no such port exists yet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphElementResolver%23IGraphElementResolver-method-resolvePort">Online Documentation</a>
 */
   fun resolvePort( context: IParseContext ,
 ownerId: ElementId ,
 id: ElementId ):IPort?

companion object : InterfaceMetadata<IGraphElementResolver> {
}
}
