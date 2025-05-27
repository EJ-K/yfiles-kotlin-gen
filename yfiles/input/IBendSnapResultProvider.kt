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
import yfiles.graph.IBend
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface that is used by the [GraphSnapContext] for [bends][IBend] to collect a number of [SnapResult]s during the move/edit operation.
 * @see [GraphSnapContext]
 * @see [BendDecorator.bendSnapResultProviderDecorator][yfiles.graph.BendDecorator.bendSnapResultProviderDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendSnapResultProvider">Online Documentation</a>
 */
external interface IBendSnapResultProvider : YObject {
/**
 * Called when a node is [dragged][IDragHandler.handleMove] to add [SnapResult]s for [OrthogonalSnapLine]s to which this bend can potentially snap.
 * @param [context] The snap context which manages the snap lines and the settings.
 * @param [event] The event argument to obtain the necessary information from and [add results to][CollectSnapResultsEventArgs.addSnapResult].
 * @param [suggestedLocation] The [location][IBend.location] of the bend if the bend would not snap.
 * @param [bend] The bend that is being moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendSnapResultProvider%23IBendSnapResultProvider-method-collectSnapResults">Online Documentation</a>
 */
   fun collectSnapResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 suggestedLocation: Point ,
 bend: IBend )

companion object : InterfaceMetadata<IBendSnapResultProvider> {

/**
 * Creates an implementation of the interface [IBendSnapResultProvider] by using the given function as implementation for its [collectSnapResults] method.
 * @param [collectSnapResults] A function for [IBendSnapResultProvider]'s single abstract method [collectSnapResults].
 * @return An instance of the [IBendSnapResultProvider] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendSnapResultProvider%23IBendSnapResultProvider-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                collectSnapResults: (
            context: GraphSnapContext,
event: CollectSnapResultsEventArgs,
suggestedLocation: Point,
bend: IBend
            ) -> Unit 
            ):IBendSnapResultProvider
}
}
