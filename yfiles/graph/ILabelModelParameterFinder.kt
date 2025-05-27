// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IOrientedRectangle
import yfiles.lang.InterfaceMetadata

/**
 * Implementations of this interface can be used to find the best [ILabelModelParameter] to approximate a given layout for a given [ILabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterFinder">Online Documentation</a>
 */
external interface ILabelModelParameterFinder  {
  /**
   * Tries to find a parameter that best matches the given layout for the label instance whose lookup returned this finder.
   * @param [layout] The anticipated layout for the label.
   * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterFinder%23ILabelModelParameterFinder-method-findBestParameter">Online Documentation</a>
   */
  fun findBestParameter(
    layout: IOrientedRectangle,
  ): ILabelModelParameter

  
  companion object : InterfaceMetadata<ILabelModelParameterFinder> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterFinder%23ILabelModelParameterFinder-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      findBestParameter: (layout: IOrientedRectangle) -> ILabelModelParameter
    ): ILabelModelParameterFinder
  }
}
