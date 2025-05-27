// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Callback interface for instances that can create bends for a given edge and graph.
 * @see [GraphEditorInputMode.onCreateBendInputModeBendCreated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendCreator">Online Documentation</a>
 */
external interface IBendCreator : YObject {
/**
 * Creates a bend at the given graph for the given edge at the position supplied.
 * @param [context] The context for which the bend should be created.
 * @param [graph] The graph, the edge belongs to.
 * @param [edge] The edge.
 * @param [location] The preferred coordinates of the bend.
 * @return The index of the bend in the edges' [IEdge.bends] or `-1` if no bend has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendCreator%23IBendCreator-method-createBend">Online Documentation</a>
 */
   fun createBend( context: IInputModeContext ,
 graph: IGraph ,
 edge: IEdge ,
 location: Point ):Int

companion object : InterfaceMetadata<IBendCreator> {
/**
 * A static instance that does not create any bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendCreator%23NO_BENDS">Online Documentation</a>
 */
 val NO_BENDS: IBendCreator
/**
 * Creates an implementation of the interface [IBendCreator] by using the given function as implementation for its [createBend] method.
 * @param [createBend] A function for [IBendCreator]'s single abstract method [createBend].
 * @return An instance of the [IBendCreator] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendCreator%23IBendCreator-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                createBend: (
            context: IInputModeContext,
graph: IGraph,
edge: IEdge,
location: Point
            ) -> Int 
            ):IBendCreator
}
}
