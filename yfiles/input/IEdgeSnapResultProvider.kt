// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IListEnumerable
import yfiles.graph.IEdge
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for classes that help during snapping of parts of edges.
 * @see [EdgeDecorator.edgeSnapResultProviderDecorator][yfiles.graph.EdgeDecorator.edgeSnapResultProviderDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeSnapResultProvider">Online Documentation</a>
 */
external interface IEdgeSnapResultProvider : YObject {
/**
 * Called to during the snapping operation whenever [snap results are collected][SnapContext.CollectSnapResults].
 * @param [context] The context that is using this instance.
 * @param [event] The event argument to obtain the necessary information from and [add results to][CollectSnapResultsEventArgs.addSnapResult].
 * @param [movementInfos] The movement infos that describe the `edge`.
 * @param [edge] The edge for which the [SnapResult]s should be [collected][CollectSnapResultsEventArgs.addSnapResult].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeSnapResultProvider%23IEdgeSnapResultProvider-method-collectSnapResults">Online Documentation</a>
 */
   fun collectSnapResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 movementInfos: IListEnumerable<MovementInfo> ,
 edge: IEdge )

companion object : InterfaceMetadata<IEdgeSnapResultProvider> {

/**
 * Creates an implementation of the interface [IEdgeSnapResultProvider] by using the given function as implementation for its [collectSnapResults] method.
 * @param [collectSnapResults] A function for [IEdgeSnapResultProvider]'s single abstract method [collectSnapResults].
 * @return An instance of the [IEdgeSnapResultProvider] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeSnapResultProvider%23IEdgeSnapResultProvider-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                collectSnapResults: (
            context: GraphSnapContext,
event: CollectSnapResultsEventArgs,
movementInfos: IListEnumerable<MovementInfo>,
edge: IEdge
            ) -> Unit 
            ):IEdgeSnapResultProvider
}
}
