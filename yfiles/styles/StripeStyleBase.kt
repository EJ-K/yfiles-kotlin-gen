// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.IStripe
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata
import yfiles.view.IRenderContext
import yfiles.view.Visual

/**
 * An abstract base class that makes it possible to easily implement a custom [IStripeStyle].
 * @param [TVisual] The optional type of the [Visual] created and updated by the [createVisual][StripeStyleBase] and [updateVisual][StripeStyleBase] methods. This type argument can be omit, but specifying a more concrete type helps conveniently implementing [updateVisual][StripeStyleBase] with TypeScript.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeStyleBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [StripeStyleBase] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeStyleBase%23StripeStyleBase-constructor-StripeStyleBase">Online Documentation</a>
 */
abstract external class StripeStyleBase<TVisual : Visual> protected constructor() : IStripeStyle {
  /**
   * Gets the renderer implementation for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeStyleBase%23renderer">Online Documentation</a>
   */
  final override val renderer: IStripeStyleRenderer
  
  /**
   * Creates a new object that is a copy of the current instance.
   * @return A new object that is a copy of this instance using a memberwise clone.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeStyleBase%23StripeStyleBase-method-clone">Online Documentation</a>
   */
  override fun clone(): StripeStyleBase<TVisual>
  
  /**
   * Creates the visual.
   * @param [stripe] The stripe to which this style instance is assigned.
   * @return The visual as required by the [createVisual][yfiles.view.IVisualCreator] interface.
   * @see [updateVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeStyleBase%23StripeStyleBase-method-createVisual">Online Documentation</a>
   */
  protected abstract fun createVisual(
    context: IRenderContext,
    stripe: IStripe,
  ): TVisual?
  
  /**
   * Performs the [lookup][yfiles.collections.ILookup] operation for the [getContext][IStripeStyleRenderer] that has been queried from the [renderer][StripeStyleBase].
   * @param [stripe] The stripe to use for the context lookup.
   * @param [type] The type to query.
   * @return An implementation of the `type` or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeStyleBase%23StripeStyleBase-method-lookup">Online Documentation</a>
   */
  protected open fun <T : Any> lookup(
    stripe: IStripe,
    type: IClassMetadata<T>,
  ): T?
  
  /**
   * Updates the visual previously created by [createVisual][StripeStyleBase].
   * @param [oldVisual] The visual that has been created in the call to [createVisual][StripeStyleBase].
   * @param [stripe] The stripe to which this style instance is assigned.
   * @return The visual as required by the [createVisual][yfiles.view.IVisualCreator] interface.
   * @see [createVisual]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeStyleBase%23StripeStyleBase-method-updateVisual">Online Documentation</a>
   */
  protected open fun updateVisual(
    context: IRenderContext,
    oldVisual: TVisual,
    stripe: IStripe,
  ): TVisual?
  
  companion object : ClassMetadata<StripeStyleBase<*>> {
  }
}
