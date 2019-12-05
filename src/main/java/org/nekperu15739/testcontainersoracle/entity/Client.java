/*
 * Copyright (c) 2018 Ryanair Ltd. All rights reserved.
 */
package org.nekperu15739.testcontainersoracle.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT", schema = "DELIVERY")
@Builder
@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue
    private String tlc;
    private String name;

}
