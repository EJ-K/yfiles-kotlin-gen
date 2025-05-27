// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IContextLookup
import yfiles.collections.IContextLookupChainLink
import yfiles.collections.ILookupDecorator
import yfiles.collections.LookupDecorator
import yfiles.input.IEditLabelHelper
import yfiles.input.IPositionHandler
import yfiles.input.IStripeInputRenderer
import yfiles.lang.ClassMetadata
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata

/**
 * Helps in [decorating][ILookupDecorator] the [lookup][yfiles.collections.ILookup] method of [IStripe] instances by providing access to decorators for the most common types.
 * @see [TableDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [StripeDecorator] class.
 * @param [decorator] The decorator to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-constructor-StripeDecorator">Online Documentation</a>
 */
external class StripeDecorator<TStripe : IStripe> (
  interfaceType: IClassMetadata<TStripe>,
  decorator: ILookupDecorator,
)  {
  /**
   * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for the `TStripe`s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23editLabelHelper">Online Documentation</a>
   */
  final val editLabelHelper: LookupDecorator<TStripe, IEditLabelHelper>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IStripeInputRenderer] type for the type of items this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23inputRenderer">Online Documentation</a>
   */
  final val inputRenderer: LookupDecorator<TStripe, IStripeInputRenderer>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for the type of items this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23positionHandler">Online Documentation</a>
   */
  final val positionHandler: LookupDecorator<TStripe, IPositionHandler>
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-add">Online Documentation</a>
   */
  fun add(
    link: IContextLookupChainLink<IStripe>,
  )
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    link: IContextLookupChainLink<IStripe>,
  )
  
  /**
   * Adds a generic callback as a chain link to the lookup.
   * @param [genericLink] The generic callback to add to the lookup chain.
   * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator] to the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-addGenericLookup">Online Documentation</a>
   */
  fun addGenericLookup(
    genericLink: Func4<TStripe, IClassMetadata<*>, IContextLookup<*>, Any>,
  ): IContextLookupChainLink<*>
  
  /**
   * Creates a [LookupDecorator] for `TStripe`s that can be used to decorate `TInterface` types of the labels.
   * @param [TInterface] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @param [interfaceType] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @return A new [LookupDecorator] for the specified interface.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-getDecoratorFor">Online Documentation</a>
   */
  fun <TInterface> getDecoratorFor(
    interfaceType: IClassMetadata<TInterface>,
  ): LookupDecorator<TStripe, TInterface>
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for stripes.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-remove">Online Documentation</a>
   */
  fun remove(
    link: IContextLookupChainLink<IStripe>,
  )
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for stripes.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDecorator%23StripeDecorator-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    link: IContextLookupChainLink<IStripe>,
  )
  
  companion object : ClassMetadata<StripeDecorator<*>> {
  }
}

inline operator fun <TStripe : IStripe> StripeDecorator<TStripe>.invoke(
    block: StripeDecorator<TStripe>.() -> Unit
): StripeDecorator<TStripe> = apply(block)
