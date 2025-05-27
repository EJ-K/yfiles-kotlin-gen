// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.collections.ILookup
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata

/**
 * An implementation of [ILabelModel] that can be used to create custom label models out of existing [ILabelModel] and [ILabelModelParameter] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this label model with no label models or parameters added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-constructor-CompositeLabelModel">Online Documentation</a>
 */
external class CompositeLabelModel () : ILabelModel {
  /**
   * Gets a list of [CompositeLabelModelParameter] that were created by [addParameter][CompositeLabelModel].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23parameters">Online Documentation</a>
   */
  final val parameters: IEnumerable<CompositeLabelModelParameter>
  
  /**
   * Adds another [ILabelModel] to this model's collection of label models.
   * @param [labelModel] The label model to add to this instance.
   * @param [weight] The weight to associate with parameters created by this model. If the value is not set, the default is `1.0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-addModel(ILabelModel,number)">Online Documentation</a>
   */
  fun addModel(
    labelModel: ILabelModel,
    weight: Double  = definedExternally,
  )
  
  /**
   * Adds the [model][ILabelModelParameter] of the `labelModelParameter` to this model's collection of label models and returns the `labelModelParameter` wrapped in a [CompositeLabelModelParameter].
   * @param [labelModelParameter] The parameter whose model should be added to this instance and which is wrapped and returned.
   * @param [profit] The profit to associate with the wrapped parameters and all parameters created by this model. If the value is not set, the default is `1.0`
   * @return The given `labelModelParameter` wrapped in a [CompositeLabelModelParameter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-addModel(ILabelModelParameter,number)">Online Documentation</a>
   */
  fun addModel(
    labelModelParameter: ILabelModelParameter,
    profit: Double  = definedExternally,
  ): CompositeLabelModelParameter
  
  /**
   * Adds another parameter to this model's collection of parameters.
   * @param [layoutParameter] The parameter to add to this instance.
   * @param [weight] The weight to associate with the parameter. If the value is not set, the default is `1.0`
   * @return A new parameter that wraps the provided parameter and uses this instance as its model.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-addParameter">Online Documentation</a>
   */
  fun addParameter(
    layoutParameter: ILabelModelParameter,
    weight: Double  = definedExternally,
  ): CompositeLabelModelParameter
  
  /**
   * Tries to find a parameter that best matches the given layout for the provided label instance.
   * @param [label] The label to find a parameter for.
   * @param [layout] The anticipated layout for the label.
   * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-findBestParameter">Online Documentation</a>
   */
  fun findBestParameter(
    label: ILabel,
    layout: IOrientedRectangle,
  ): ILabelModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-getGeometry">Online Documentation</a>
   */
  override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  /**
   * Returns an enumerator over a set of possible [ILabelModelParameter] instances that can be used for the given label and model.
   * @param [label] The label instance to use.
   * @return A possibly empty enumerator over a set of label model parameters.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-getParameters">Online Documentation</a>
   */
  fun getParameters(
    label: ILabel,
  ): IEnumerable<ILabelModelParameter>
  
  companion object : ClassMetadata<CompositeLabelModel> {
  }
}
