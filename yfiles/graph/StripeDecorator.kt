// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.input.IEditLabelHelper
import yfiles.input.IPositionHandler
import yfiles.input.IStripeInputVisualizationHelper
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Helps in [decorating][ILookupDecorator.addLookup] the [ILookup.lookup] method of [IStripe] instances by providing access to decorators for the most common types.
 * @see [TableDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [StripeDecorator] class.
 * @param [decorator] The decorator to use, which can be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-constructor-StripeDecorator">Online Documentation</a>
 */
external  class StripeDecorator<TStripe : IStripe>  ( type: YClass<TStripe> ,
 decorator: ILookupDecorator? ) : YObject {

/**
 * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for the `TStripe`s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23editLabelHelperDecorator">Online Documentation</a>
 */
final val editLabelHelperDecorator: LookupDecorator<TStripe, IEditLabelHelper>
/**
 * Gets a [LookupDecorator] that decorates the [IStripeInputVisualizationHelper] type for the type of items this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23inputVisualizationDecorator">Online Documentation</a>
 */
final val inputVisualizationDecorator: LookupDecorator<TStripe, IStripeInputVisualizationHelper>
/**
 * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for the type of items this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23positionHandlerDecorator">Online Documentation</a>
 */
final val positionHandlerDecorator: LookupDecorator<TStripe, IPositionHandler>
/**
 * Creates a [LookupDecorator] for `TStripe`s that can be used to decorate `TInterface` types of the labels.
 * @param [TInterface] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [type] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [decorateNulls] if set to `true` `null` values will be decorated, otherwise not.
 * @param [nullIsFallback] if set to `true` `null` values will be treated as fallback values, otherwise they will be used as the final result.
 * @return A new [LookupDecorator] for the specified interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-getDecoratorFor">Online Documentation</a>
 */
 final   fun <TInterface : YObject>getDecoratorFor( type: YClass<TInterface> ,
 decorateNulls: Boolean  = definedExternally,
 nullIsFallback: Boolean  = definedExternally):LookupDecorator<TStripe, TInterface>
/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for stripes.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-remove">Online Documentation</a>
 */
 final   fun remove( lookup: IContextLookupChainLink<IStripe> )

/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for stripes.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( lookup: IContextLookupChainLink<IStripe> )

companion object : ClassMetadata<StripeDecorator<*>> {
}
}

inline operator fun <TStripe : IStripe> StripeDecorator<TStripe>.invoke(
    block: StripeDecorator<TStripe>.() -> Unit
): StripeDecorator<TStripe> = apply(block)
