// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IModelItem
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Queried by the [GraphSnapContext] to add [OrthogonalSnapLine]s to its collections during the [initialization phase][SnapContext.isInitializing].
 * @see [NodeDecorator.snapLineProviderDecorator][yfiles.graph.NodeDecorator.snapLineProviderDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISnapLineProvider">Online Documentation</a>
 */
external interface ISnapLineProvider<in T : IModelItem> : YObject {
/**
 * Called by the [GraphSnapContext] when a [drag][GraphSnapContext.initializeDrag] is about to start.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [item] The item to add snap lines for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISnapLineProvider%23ISnapLineProvider-method-addSnapLines">Online Documentation</a>
 */
   fun addSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 item: T )

companion object : InterfaceMetadata<ISnapLineProvider<*>> {

/**
 * Creates an implementation of the interface [ISnapLineProvider] by using the given function as implementation for its [addSnapLines] method.
 * @param [addSnapLines] A function for [ISnapLineProvider]'s single abstract method [addSnapLines].
 * @return An instance of the [ISnapLineProvider] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISnapLineProvider%23ISnapLineProvider-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun <T : IModelItem> invoke(
                addSnapLines: (
            context: GraphSnapContext,
event: CollectGraphSnapLinesEventArgs,
item: T
            ) -> Unit 
            ):ISnapLineProvider<T>
}
}
